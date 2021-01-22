package com.inno.ace.model.dao.ace.flexibleWork;

import com.inno.ace.model.vo.common.PagingVO;
import com.inno.ace.model.vo.flexibleWork.WorkGroupVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkGroupDao {

    /** 근무 그룹 리스트 조회 */
    List<WorkGroupVO> selectWorkGroupList(PagingVO pagingVO);

    WorkGroupVO selectWorkGroup(int workGroupId);

    /** 그룹 명 중복 확인 */
    int selectDupleGroupNm(String workGroupNm);

    /** 근무 그룹 등록 */
    int insertWorkGroup(WorkGroupVO workGroupVO);

    /** 근무 그룹 수정 */
    int udpateWorkGroup(WorkGroupVO workGroupVO);

    /** 근무 그룹 삭제 */
    int deleteWorkGroup(int workGroupId);

}
