package com.inno.ace.model.dao.ace.flexibleWork;

import com.inno.ace.model.vo.flexibleWork.WorkWeekVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkWeekDao {

    /** 근무 사용자 저장 */
    int insertWorkWeek(WorkWeekVO workWeekVO);

    /** 근무 사용자 삭제 */
    int deleteWorkWeek(int workWeekid);

    /** 근무 그룹에 맞는 근무 사용자 전체 삭제 */
    int deleteWorkWeekByWorkGroupId(int workGroupId);

}
