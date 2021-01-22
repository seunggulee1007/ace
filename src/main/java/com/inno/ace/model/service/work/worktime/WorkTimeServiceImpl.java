package com.inno.ace.model.service.work.worktime;

import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.flexibleWork.WorkTimeDao;
import com.inno.ace.model.vo.common.ResultVO;
import com.inno.ace.model.vo.flexibleWork.WorkTimeVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WorkTimeServiceImpl implements WorkTimeService {
    private final WorkTimeDao workTimeDao;

    /**
     * 근무 시간 저장
     * @param workTimeVO
     * @return
     */
    @Transactional
    public ResultVO insertWorkTime(WorkTimeVO workTimeVO) {
        long result = 0;
        String resultMsg= CommonMsg.SUCCESS_WRITE.getMsg();
        if(workTimeDao.insertWorkTime(workTimeVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_WRITE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 근무 시간 수정
     * @param workTimeVO
     * @return
     */
    @Transactional
    public ResultVO updateWorkTime(WorkTimeVO workTimeVO) {
        long result = 0;
        String resultMsg= CommonMsg.SUCCESS_MODIFY.getMsg();
        if(workTimeDao.updateWorkTime(workTimeVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_MODIFY.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 근무 시간 삭제
     * @param workDeptid
     * @return
     */
    @Transactional
    public ResultVO deleteWorkTime(int workDeptid) {
        long result = 0;
        String resultMsg= CommonMsg.SUCCESS_DELETE.getMsg();
        if(workTimeDao.deleteWorkTime(workDeptid) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_DELETE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 근무 시간 삭제
     * @param workGroupId
     * @return
     */
    @Transactional
    public ResultVO deleteWorkTimeByWorkGroupId(int workGroupId) {
        long result = 0;
        String resultMsg= CommonMsg.SUCCESS_DELETE.getMsg();
        if(workTimeDao.deleteWorkTimeByWorkGroupId(workGroupId) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_DELETE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

}
