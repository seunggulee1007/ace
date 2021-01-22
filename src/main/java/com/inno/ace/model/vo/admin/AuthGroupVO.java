package com.inno.ace.model.vo.admin;

import com.inno.ace.model.vo.common.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class AuthGroupVO extends CommonVO {

    /** 권한 그룹 아이디 */
    private int authGroupId;
    /** 권한 그룹 명 */
    private String authGroupNm;
    /** 사용 여부 */
    private String useYn;

    private List<AuthGroupUserVO> authUserList;

}
