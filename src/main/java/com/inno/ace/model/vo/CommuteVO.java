package com.inno.ace.model.vo;

import lombok.Data;

import java.sql.Date;

@Data
public class CommuteVO {

    /** 출퇴근 아이디 */
    private int commuteId;
    /** 사용자 아이디 */
    private String userId;
    /** 출근시간 */
    private String startDtm;
    /** 퇴근시간 */
    private String endDtm;

}
