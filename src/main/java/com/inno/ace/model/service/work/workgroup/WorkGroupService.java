package com.inno.ace.model.service.work.workgroup;

import com.inno.ace.model.vo.common.PagingVO;
import com.inno.ace.model.vo.common.ResultVO;
import com.inno.ace.model.vo.flexibleWork.WorkGroupVO;

public interface WorkGroupService {

    /**
     * 근무 그룹 리스트 조회
     * @param pagingVO
     * @return
     */
    ResultVO selectWorkGroupList(PagingVO pagingVO);

    /**
     * 근무 그룹 명 중복 체크
     * @param workGroupNm
     * @return
     */
    ResultVO selectDupleGroupNm(String workGroupNm);

    /**
     * 근무 그룹 저장
     * @param workGroupVO
     * @return
     */
    ResultVO insertWorkGroup(WorkGroupVO workGroupVO);

}
