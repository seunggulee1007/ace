package com.inno.ace.model.vo.flexibleWork;

import com.inno.ace.model.vo.common.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WorkDeptVO extends CommonVO {

    /** 근무 부서 아이디 */
    private int workDeptId;
    /** 부서 아이디 */
    private int deptId;
    /** 부서명 */
    private String deptNm;
    /** 근무 그룹 아이디 */
    private int workGroupId;

}
