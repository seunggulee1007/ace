package com.inno.ace.model.vo.flexibleWork;

import com.inno.ace.model.vo.common.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WorkWeekVO extends CommonVO {

    /** 근무 요일 아이디 */
    private int workWeekId;
    /** 근무 그룹 아이디 */
    private int workGroupId;
    /** 요일 코드 */
    private int weekCd;
    /** 요일 명 */
    private String weekCdNm;

}
