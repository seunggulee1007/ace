package com.inno.ace.model.service.work.worktime;

import com.inno.ace.model.vo.common.ResultVO;
import com.inno.ace.model.vo.flexibleWork.WorkTimeVO;

public interface WorkTimeService {

    /**
     * 근무 시간 저장
     * @param workTimeVO
     * @return
     */
    ResultVO insertWorkTime(WorkTimeVO workTimeVO);

    /**
     * 근무 시간 수정
     * @param workTimeVO
     * @return
     */
    ResultVO updateWorkTime(WorkTimeVO workTimeVO);

    /**
     * 근무 시간 삭제
     * @param workDeptid
     * @return
     */
    ResultVO deleteWorkTime(int workDeptid);

    /**
     * 근무 시간 삭제
     * @param workGroupId
     * @return
     */
    ResultVO deleteWorkTimeByWorkGroupId(int workGroupId);

}
