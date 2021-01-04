package com.inno.ace.model.service.work.workdept;

import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.WorkDeptDao;
import com.inno.ace.model.vo.ResultVO;
import com.inno.ace.model.vo.work.WorkDeptVO;
import com.inno.ace.model.vo.work.WorkUserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WorkDeptServiceImpl implements WorkDeptService {
    private final WorkDeptDao workDeptDao;

    /**
     * 근무 부서 등록
     * @param workDeptVO
     * @return
     */
    @Transactional
    public ResultVO insertWorkDept(WorkDeptVO workDeptVO) {
        long result = 0;
        String resultMsg= CommonMsg.SUCCESS_WRITE.getMsg();
        if(workDeptDao.insertWorkDept(workDeptVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_WRITE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 근무 직원 삭제
     * @param workDeptid
     * @return
     */
    @Transactional
    public ResultVO deleteWorkDept(int workDeptid) {
        long result = 0;
        String resultMsg= CommonMsg.SUCCESS_DELETE.getMsg();
        if(workDeptDao.deleteWorkDept(workDeptid) < 1) {
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
    public ResultVO deleteWorkDeptByWorkGroupId(int workGroupId) {
        long result = 0;
        String resultMsg= CommonMsg.SUCCESS_DELETE.getMsg();
        if(workDeptDao.deleteWorkDeptByWorkGroupId(workGroupId) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_DELETE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

}
