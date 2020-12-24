package com.inno.ace.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class CodeMasterVO extends CommonVO{

    /** 코드 마스터 아이디 */
    private int codeMasterId;
    /** 코드 마스터 명 */
    private String codeMasterNm;
    /** 사용 여부 */
    private String useYn;

    private List<CodeVO> codeList;
    
}
