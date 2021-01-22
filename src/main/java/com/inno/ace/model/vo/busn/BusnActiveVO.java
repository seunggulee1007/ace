package com.inno.ace.model.vo.busn;

import com.inno.ace.model.vo.common.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BusnActiveVO extends CommonVO {

    /** 영업활동 아이디 */
    private int busnActiveId;
    /** 영업기회 아이디 */
    private int busnOptId;
    /** 고객아이디 */
    private int customerId;
    /** 방문일자 */
    private String visitDt;
    /** 방문시간 */
    private String visitTm;
    /** 영업 담당자 */
    private String managerId;
    /** 영업활동방법 */
    private int salesMethodCd;
    /** 영업활동방법 명 */
    private String salesMethodCdNm;
    /** 영업활동 목적 */
    private int salesPurposeCd;
    /** 영업활동 목적 명 */
    private String salesPurposeCdNm;
    /** 세부활동내역 */
    private String salesDetail;
    /** 동행자 */
    private String accompId;

}
