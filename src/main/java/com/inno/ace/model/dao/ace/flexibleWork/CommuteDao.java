package com.inno.ace.model.dao.ace.flexibleWork;

import com.inno.ace.model.vo.flexibleWork.CommuteVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface CommuteDao {

    /** 금일 근무 시간 가져오기 */
    Optional<CommuteVO> selectTodayWork(String userId);

    /** 근무 시작 */
    int startWork(String userId);

    /** 근무 종료 */
    int endWork(int commuteId);

}
