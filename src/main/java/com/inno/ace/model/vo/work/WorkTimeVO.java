package com.inno.ace.model.vo.work;

import com.inno.ace.model.vo.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 근무 시간 VO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WorkTimeVO extends CommonVO {

    /** 근무 시간 아이디 */
    private int workTimeId;
    /** 근무 그룹 아이디 */
    private int workGroupId;
    /** 근무시간 종류 (C:의무시간, ,W:근무시간, R:휴게시간)*/
    private String workTimeType;
    /** 근무 시간 종류 명 */
    private String workTimeTypeNm;
    /** 근무시작 시간 */
    private String workTimeFr;
    /** 근무종료 시간 */
    private String workTimeTo;
    
}
