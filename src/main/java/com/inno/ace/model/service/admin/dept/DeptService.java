package com.inno.ace.model.service.admin.dept;

import com.inno.ace.model.vo.admin.DeptVO;
import com.inno.ace.model.vo.common.ResultVO;

public interface DeptService {

    /**
     * 메뉴 리스트 조회
     * @return
     */
    ResultVO selectDeptList();

    /**
     * 메뉴 조회
     * @param deptId
     * @return
     */
    ResultVO selectDept(int deptId);


    /**
     * 메뉴 등록
     * @param menuVO
     * @return
     */
    ResultVO insertDept(DeptVO deptVO);

    /**
     * 메뉴 수정
     * @param deptVO
     * @return
     */
    ResultVO updateDept(DeptVO deptVO);

    /**
     * 메뉴 순번 변경
     * @param gu
     * @param parDeptId
     * @param ord
     * @return
     */
    ResultVO updateOrd(int gu, int ord, int parDeptId);

    /**
     * 메뉴 삭제
     * @param deptId
     * @return
     */
    ResultVO deleteDept(int deptId);

}
