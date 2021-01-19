package com.inno.ace.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CustomerVO extends CommonVO {

    /** 고객 아이디 */
    private int customerId;
    /** 고객명*/
    private String customerNm;
    /** 거래처 아이디 */
    private int clientId;
    /** 퇴사 여부 */
    private String resignationYn;
    /** 직위/직책*/
    private int rankCd;
    /** 직위/직책 명 */
    private String rankCdNm;
    /** 부서명 */
    private String deptNm;
    /** 휴대전화 */
    private String phone;
    /** 이메일 */
    private String email;

}
