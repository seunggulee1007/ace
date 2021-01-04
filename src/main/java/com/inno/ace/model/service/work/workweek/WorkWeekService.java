package com.inno.ace.model.service.work.workweek;

import com.inno.ace.model.vo.ResultVO;
import com.inno.ace.model.vo.work.WorkWeekVO;

public interface WorkWeekService {

    /**
     * 근무 요일 저장
     * @param workWeekVO
     * @return
     */
    ResultVO insertWorkWeek(WorkWeekVO workWeekVO);

    /**
     * 근무 요일 삭제
     * @param workWeekId
     * @return
     */
    ResultVO deleteWorkWeek(int workWeekId);

}
