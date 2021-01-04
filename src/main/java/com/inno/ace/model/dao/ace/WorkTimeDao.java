package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.work.WorkDeptVO;
import com.inno.ace.model.vo.work.WorkTimeVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkTimeDao {

    /** 근무 시간 저장 */
    int insertWorkTime(WorkTimeVO workTimeVO);

    /** 근무 시간 수정 */
    int updateWorkTime(WorkTimeVO workTimeVO);

    /** 근무 시간 삭제 */
    int deleteWorkTime(int workDeptid);

    /** 근무 그룹에 맞는 근무 시간 전체 삭제 */
    int deleteWorkTimeByWorkGroupId(int workGroupId);

}
