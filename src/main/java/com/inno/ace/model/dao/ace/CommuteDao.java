package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.CommuteVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface CommuteDao {

    Optional<CommuteVO> selectTodayWork(String userId);

    int startWork(String userId);

    int endWork(int commuteId);

}
