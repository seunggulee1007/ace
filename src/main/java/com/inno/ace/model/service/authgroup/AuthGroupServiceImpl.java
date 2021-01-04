package com.inno.ace.model.service.authgroup;

import com.inno.ace.advice.exception.DuplicationException;
import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.AuthGroupDao;
import com.inno.ace.model.dao.ace.AuthGroupUserDao;
import com.inno.ace.model.vo.AuthGroupUserVO;
import com.inno.ace.model.vo.AuthGroupVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthGroupServiceImpl implements AuthGroupService {

    private final AuthGroupDao authGroupDao;
    private final AuthGroupUserDao authGroupUserDao;

    /**
     * 권한 그룹 목록
     * @return
     */
    public ResultVO selectAuthGroupList() {
        return ResultVO.builder().data(authGroupDao.selectAuthGroupList()).build();
    }

    /**
     * 권한 그룹 명 중복 체크
     * @param authGroupNm
     * @return
     */
    public ResultVO selectDupleGroupNm(String authGroupNm) {
        if(authGroupDao.selectDupleGroupNm(authGroupNm) > 0) {
            throw new DuplicationException(CommonMsg.DUPLE_AUTH_GROUP_NM.getMsg());
        }
        return ResultVO.builder().resultMsg(CommonMsg.AVAILABLE_AUTH_GROUP_NM.getMsg()).build();
    }

    /**
     * 권한 그룹 등록
     * @param authGroupVO
     * @return
     */
    @Transactional
    public ResultVO insertAuthGroup(AuthGroupVO authGroupVO) {

        int result = 0;
        String resultMsg= CommonMsg.SUCCESS_WRITE.getMsg();
        if(authGroupDao.insertAuthGroup(authGroupVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_WRITE.getMsg();
        }else {
            if(authGroupVO.getAuthUserList().size() > 0) {
                for(AuthGroupUserVO authGroupUserVO : authGroupVO.getAuthUserList()) {
                    authGroupUserVO.setAuthGroupId(authGroupVO.getAuthGroupId());
                    authGroupUserDao.insertAuthGroupUser(authGroupUserVO);
                }
            }
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).data(authGroupVO).build();
    }

    /**
     * 권한 그룹 수정
     * @param authGroupVO
     * @return
     */
    @Transactional
    public ResultVO updateAuthGroup(AuthGroupVO authGroupVO) {
        int result = 0;
        String resultMsg= CommonMsg.SUCCESS_MODIFY.getMsg();
        if(authGroupDao.updateAuthGroup(authGroupVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_MODIFY.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 권한 그룹 삭제
     * @param autuGroupId
     * @return
     */
    @Transactional
    public ResultVO deleteAuthGroup(int autuGroupId) {
        int result = 0;
        String resultMsg= CommonMsg.SUCCESS_DELETE.getMsg();
        if(authGroupDao.deleteAuthGroup(autuGroupId) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_DELETE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

}
