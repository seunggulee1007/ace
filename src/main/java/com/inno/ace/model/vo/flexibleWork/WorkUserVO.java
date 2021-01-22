package com.inno.ace.model.vo.flexibleWork;

import com.inno.ace.model.vo.common.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WorkUserVO extends CommonVO {

    /** 근무 사용자 아이디 */
    private int workUserId;
    /** 근무 그룹 아이디 */
    private int workGroupId;
    /** 사용자 아이디 */
    private String userId;
    /** 사용자명 */
    private String userNm;

}
