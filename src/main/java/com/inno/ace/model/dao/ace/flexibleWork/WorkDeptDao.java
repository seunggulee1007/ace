package com.inno.ace.model.dao.ace.flexibleWork;

import com.inno.ace.model.vo.flexibleWork.WorkDeptVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkDeptDao {

    /** 근무 부서 저장 */
    int insertWorkDept(WorkDeptVO workDeptVO);

    /** 근무 부서 수정 */
    int updateWorkDept(WorkDeptVO workDeptVO);

    /** 근무 부서 삭제 */
    int deleteWorkDept(int workDeptid);

    /** 근무 그룹에 맞는 근무 부서 전체 삭제 */
    int deleteWorkDeptByWorkGroupId(int workGroupId);

}
