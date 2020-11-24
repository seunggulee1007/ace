package com.inno.ace.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CodeVO extends CommonVO {

    /** 코드 아이디 */
    private int codeId;
    /** 코드 마스터 아이디 */
    private int codeMasterId;
    /** 코드 */
    private String code;
    /** 코드 명 */
    private String codeNm;
    /** 사용 여부 */
    private String useYn;
    /** 문자형 1 */
    private String char1;
    /** 문자형 2 */
    private String char2;
    /** 문자형 3 */
    private String char3;
    /** 문자형 4 */
    private String char4;
    /** 문자형 5 */
    private String char5;
    /** 정수형 1 */
    private int int1;
    /** 정수형 2 */
    private int int2;
    /** 정수형 3 */
    private int int3;
    /** 정수형 4 */
    private int int4;
    /** 정수형 5 */
    private int int5;
    
}
