package com.inno.ace.model.service.menuauth;

import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.MenuAuthDao;
import com.inno.ace.model.vo.MenuAuthVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuAuthServiceImpl implements MenuAuthService {

    private final MenuAuthDao menuAuthDao;

    public ResultVO insertMenuAuth(MenuAuthVO menuAuthVO) {
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_WRITE.getMsg();
        if(menuAuthDao.insertMenuAuth(menuAuthVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_WRITE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).data(menuAuthVO).build();
    }

    public ResultVO updateMenuAuth(MenuAuthVO menuAuthVO) {
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_MODIFY.getMsg();
        if(menuAuthDao.updateMenuAuth(menuAuthVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_MODIFY.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

}
