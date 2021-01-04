package com.inno.ace.model.service.work.workuser;

import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.WorkUserDao;
import com.inno.ace.model.vo.ResultVO;
import com.inno.ace.model.vo.work.WorkUserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WorkUserServiceImpl implements  WorkUserService {
    private final WorkUserDao workUserDao;

    /**
     * 근무 직원 등록
     * @param workUserVO
     * @return
     */
    @Transactional
    public ResultVO insertWorkUser(WorkUserVO workUserVO) {
        long result = 0;
        String resultMsg= CommonMsg.SUCCESS_WRITE.getMsg();
        if(workUserDao.insertWorkUser(workUserVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_WRITE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 근무 직원 삭제
     * @param workUserId
     * @return
     */
    @Transactional
    public ResultVO deleteWorkUser(int workUserId) {
        long result = 0;
        String resultMsg= CommonMsg.SUCCESS_DELETE.getMsg();
        if(workUserDao.deleteWorkUser(workUserId) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_DELETE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 근무 직원 삭제
     * @param workGroupId
     * @return
     */
    @Transactional
    public ResultVO deleteWorkUserByWorkGroupId(int workGroupId) {
        long result = 0;
        String resultMsg= CommonMsg.SUCCESS_DELETE.getMsg();
        if(workUserDao.deleteWorkUserByWorkGroupId(workGroupId) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_DELETE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

}
