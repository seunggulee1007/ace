package com.inno.ace.model.service.user;

import com.inno.ace.advice.exception.AlreadyMemberException;
import com.inno.ace.advice.exception.FalseIDException;
import com.inno.ace.advice.exception.NoMemberException;
import com.inno.ace.config.JwtTokenProvider;
import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.UserDao;
import com.inno.ace.model.service.profile.ProfileService;
import com.inno.ace.model.vo.FileVO;
import com.inno.ace.model.vo.ProfileVO;
import com.inno.ace.model.vo.ResultVO;
import com.inno.ace.model.vo.UserVO;
import com.inno.ace.util.FileUtil;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    
    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;
    private final FileUtil fileUtil;
    private final ProfileService profileService;

    public ResultVO selectUserList(int deptCd) {
        return ResultVO.builder().data(userDao.selectUserListByDeptId(deptCd)).build();
    }

    @Transactional
    public ResultVO insertUser(HttpServletRequest request, UserVO userVO) {
        UserVO user = userDao.selectUser(userVO.getUserId()).orElseGet(() -> new UserVO());
        if(!StringUtils.isEmpty(user.getUserId())) {
            throw new AlreadyMemberException();
        }
        userVO.setPassword(passwordEncoder.encode(userVO.getUserId() + "123!@"));
        if(userDao.insertUser(userVO) > 0) {
            if(request instanceof MultipartHttpServletRequest) {
                MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
                List<FileVO> fileList = fileUtil.makeFileVO(mRequest);
                for(FileVO fileVO : fileList) {
                    ProfileVO profileVO = new ProfileVO(fileVO);
                    profileVO.setUserId(userVO.getUserId());
                    profileService.insertProfile(profileVO);
                }
            }
        };

        return ResultVO.builder().resultMsg("등록되었습니다").build();
    }
    public ResultVO signUp(UserVO userVO) throws AlreadyMemberException {
        UserVO user = userDao.selectUser(userVO.getUserId()).orElseGet(() -> new UserVO());
        if(!StringUtils.isEmpty(user.getUserId())) {
            throw new AlreadyMemberException();
        }
        userVO.setPassword(passwordEncoder.encode(userVO.getPassword()));
        userDao.insertUser(userVO);
        return ResultVO.builder().resultMsg("등록되었습니다").build();
    }
    
    public ResultVO signIn(UserVO userVO) {
        List<String> authorities = new ArrayList<>();
        UserVO user = userDao.selectUser(userVO.getUserId()).orElseThrow(NoMemberException::new);
        authorities.add("ROLE_USER");
        if (!passwordEncoder.matches(userVO.getPassword(), user.getPassword())) throw new FalseIDException();
        String token = jwtTokenProvider.createToken(user.getUserId(), authorities);
        Map<String, Object> map = new HashMap<>();
        userVO.setUserNm(user.getUserNm());
        userVO.setAdminYn(user.getAdminYn());
        map.put("authToken", token);
        map.put("user", userVO);
        return ResultVO.builder().data(map).resultMsg(CommonMsg.SUCCESS_LOGIN.getMsg()).build();
    }

    
    public ResultVO chgPwd(UserVO userVO) {
        UserVO user = userDao.selectUser(userVO.getUserId()).orElseThrow(NoMemberException::new);
        String resultMsg = "비밀번호 변경에 실패하였습니다.";
        long result = -1;
        if (!passwordEncoder.matches(userVO.getPassword(), user.getPassword())) throw new FalseIDException();
        if(userDao.updatePwd(userVO) > 0) {
            resultMsg = "비밀번호 변경에 성공하였습니다.";
            result = 0;
        }
        
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
        
    }

    public ResultVO updateUser(HttpServletRequest request, UserVO userVO){
        if(userDao.updateUser(userVO) >0 ){
            if(request instanceof MultipartHttpServletRequest) {
                MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
                List<FileVO> fileList = fileUtil.makeFileVO(mRequest);
                if(fileList.size() > 0 && StringUtils.isNotEmpty(userVO.getPhoto())) {
                    profileService.deleteFileByUserId(userVO.getUserId());
                }
                for(FileVO fileVO : fileList) {
                    ProfileVO profileVO = new ProfileVO(fileVO);
                    profileVO.setUserId(userVO.getUserId());
                    profileService.insertProfile(profileVO);
                }
            }
        }
        return ResultVO.builder().resultMsg("수정되었습니다").build();
    }

}
