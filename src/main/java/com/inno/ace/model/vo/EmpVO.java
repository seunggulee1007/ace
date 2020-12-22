package com.inno.ace.model.vo;

import lombok.Data;

@Data
public class EmpVO {

    /** 사원 아이디 */
    private int empId;
    /** 부서 아이디 */
    private int deptId;
    /** 사용자 아이디 */
    private String userId;
    /** 사원 번호 */
    private int empNo;
    /** 휴대폰 번호 */
    private String phone;
    /** 이메일 주소 */
    private String email;
    /** 직급 */
    private String rankCd;
    /** 직급명 */
    private String rankNm;
    /** 사원 상태 */
    private String empStatusCd;
    /** 사원 상태 명 */
    private String empStatusCdNm;

}
