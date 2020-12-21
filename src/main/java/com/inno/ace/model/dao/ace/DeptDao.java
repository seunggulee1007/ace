package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.DeptVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface DeptDao {

    /** 부서 리스트 조회 */
    List<DeptVO> selectDeptList();

    /** 부모아이디, 순번 채번 */
    Optional<DeptVO> selectOrdAndDeptId(int parDeptId);

    /** 부서 조회 */
    Optional<DeptVO>selectDept(int deptId);

    /** 부모가 같은 부서 전체 조회 */
    List<DeptVO> selectDeptListByParDeptId(int parDeptId);

    /** 부서 등록 */
    int insertDept(DeptVO deptVO);

    /** 부서 수정 */
    int updateDept(DeptVO deptVO);

    /** 부서 순번 변경 */
    int updateOrd(int ord, int deptId);

    /** 부서 삭제 */
    int deleteDept(int deptId);

}
