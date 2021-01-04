package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.work.WorkDeptVO;
import com.inno.ace.model.vo.work.WorkUserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkUserDao {

    /** 근무 사용자 저장 */
    int insertWorkUser(WorkUserVO workUserVO);

    /** 근무 사용자 삭제 */
    int deleteWorkUser(int workUserid);

    /** 근무 그룹에 맞는 근무 사용자 전체 삭제 */
    int deleteWorkUserByWorkGroupId(int workGroupId);

}
