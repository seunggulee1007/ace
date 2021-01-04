package com.inno.ace.model.service.work.workdept;

import com.inno.ace.model.vo.ResultVO;
import com.inno.ace.model.vo.work.WorkDeptVO;

public interface WorkDeptService {

    /**
     * 근무 부서 등록
     * @param workDeptVO
     * @return
     */
    ResultVO insertWorkDept(WorkDeptVO workDeptVO);

    /**
     * 근무 직원 삭제
     * @param workDeptid
     * @return
     */
    ResultVO deleteWorkDept(int workDeptid);

    /**
     * 근무 직원 삭제
     * @param workGroupId
     * @return
     */
    ResultVO deleteWorkDeptByWorkGroupId(int workGroupId);

}
