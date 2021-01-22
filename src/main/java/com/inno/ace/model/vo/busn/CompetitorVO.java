package com.inno.ace.model.vo.busn;

import com.inno.ace.model.vo.common.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CompetitorVO extends CommonVO {

    /** 경쟁업체 아이디 */
    private int competitorId;
    /** 엉업기회 아이디 */
    private int busnOptId;
    /** 경쟁업체 코드 */
    private int competitorCd;
    /** 경쟁업체 코드 명 */
    private String competitorCdNm;

}
