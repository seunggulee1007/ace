package com.inno.ace.model.vo.busn;

import com.inno.ace.model.vo.common.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BusnOptVO extends CommonVO {

    /** 영업기회 아이디 */
    private int busnOptId;
    /** 거래처 아이디 */
    private int clientId;
    /** 담당자 아이디 */
    private String managerId;
    /** 영업기회명 */
    private String busnOptNm;
    /** 영업기회 일자 */
    private String busnOptDt;
    /** 정보출처 */
    private int infoSourceCd;
    /** 정보 출처 명 */
    private String infoSourceCdNm;
    /** 프로젝트 유형 */
    private int projectTypeCd;
    /** 프로젝트 유형 명 */
    private String projectTypeCdNm;
    /** 지역 */
    private int areaCd;
    /** 지역 명 */
    private String areaCdNm;
    /** 성공확률 */
    private int successPercentCd;
    /** 성공확률 명 */
    private String successPercentCdNm;
    /** 예상 매출 월 */
    private String expectSalesMonth;
    /** 예상 매출 액 */
    private double expectSalesAmt;

}
