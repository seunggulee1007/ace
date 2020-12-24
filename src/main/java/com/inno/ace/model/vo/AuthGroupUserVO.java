package com.inno.ace.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AuthGroupUserVO extends CommonVO {

    /** 권한 그룹 사용자 아이디 */
    private int authGroupUserId;
    /** 권한 그룹 아이디 */
    private int authGroupId;
    /** 사용자 아이디 */
    private String userId;

}
