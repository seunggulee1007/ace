package com.inno.ace.model.vo.work;

import com.inno.ace.model.vo.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class WorkGroupVO extends CommonVO {

    /** 근무 그룹 아이디 */
    private int workGroupId;
    /** 근무 유형 */
    private int workType;
    /** 근무 유형 명 */
    private String workTypeNm;
    /** 근무 그룹명 */
    private String workGroupNm;
    /** 1일 표준 근로시간 */
    private int stdWorkingHours;
    /** 1일 표준 근로시간 명 */
    private String stdWorkingHoursNm;
    /** 정산단위 기간 */
    private int settlementUnit;
    /** 정산단위 기간 명 */
    private String settlementUnitNm;
    /** 시작일자 */
    private String startDt;
    /** 부서리스트 */
    private List<WorkDeptVO> workDeptList;
    /** 직원 리스트 */
    private List<WorkUserVO> workUserList;
    /** 근무 시간 리스트 */
    private List<WorkTimeVO> workTimeList;
    /** 근무 요일 리스트 */
    private List<WorkWeekVO> workWeekList;

    private List<WorkUserResVO> workUserResList;

}
