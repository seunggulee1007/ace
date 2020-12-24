package com.inno.ace.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AuthGroupVO extends CommonVO{

    /** 권한 그룹 아이디 */
    private int authGroupId;
    /** 권한 그룹 명 */
    private String authGroupNm;
    /** 사용 여부 */
    private String useYn;

}
