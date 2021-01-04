package com.inno.ace.model.service.work.workweek;

import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.WorkWeekDao;
import com.inno.ace.model.vo.ResultVO;
import com.inno.ace.model.vo.work.WorkWeekVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WorkWeekServiceImpl implements WorkWeekService {
    private final WorkWeekDao workWeekDao;

    /**
     * 근무 요일 저장
     * @param workWeekVO
     * @return
     */
    @Transactional
    public ResultVO insertWorkWeek(WorkWeekVO workWeekVO) {
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_WRITE.getMsg();
        if(workWeekDao.insertWorkWeek(workWeekVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_WRITE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 근무 요일 삭제
     * @param workWeekId
     * @return
     */
    @Transactional
    public ResultVO deleteWorkWeek(int workWeekId) {
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_DELETE.getMsg();
        if(workWeekDao.deleteWorkWeek(workWeekId) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_DELETE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

}
