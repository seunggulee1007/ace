package com.inno.ace.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MenuAuthVO extends CommonVO {

    /** 메뉴 권한 아이디 */
    private int menuAuthId;
    /** 메뉴 아이디 */
    private int menuId;
    /** 권한 그룹 아이디 */
    private int authGroupId;
    /** 권한 종류 (R:read, W:write, N:none) */
    private String authType;

}
