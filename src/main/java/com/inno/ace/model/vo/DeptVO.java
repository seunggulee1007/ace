package com.inno.ace.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class DeptVO extends CommonVO{

    /** 부서 아이디 */
    private int deptId;
    /** 부모 부서 아이디 */
    private int parDeptId;
    /** 부서 번호 */
    private int deptNo;
    /** 부서명 */
    private String deptNm;
    /** 순서 */
    private int ord;
    /** 사용 여부 */
    private String useYn;

    private List<DeptVO> children;

}
