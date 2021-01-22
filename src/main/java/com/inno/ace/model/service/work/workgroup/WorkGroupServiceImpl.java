package com.inno.ace.model.service.work.workgroup;

import com.inno.ace.advice.exception.DuplicationException;
import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.flexibleWork.WorkGroupDao;
import com.inno.ace.model.service.work.workdept.WorkDeptService;
import com.inno.ace.model.service.work.worktime.WorkTimeService;
import com.inno.ace.model.service.work.workuser.WorkUserService;
import com.inno.ace.model.service.work.workweek.WorkWeekService;
import com.inno.ace.model.vo.common.PagingVO;
import com.inno.ace.model.vo.common.ResultVO;
import com.inno.ace.model.vo.flexibleWork.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WorkGroupServiceImpl implements  WorkGroupService {

    private final WorkGroupDao workGroupDao;        // 근무 그룹 dao
    private final WorkDeptService workDeptService;  // 근무 부서 서비스
    private final WorkUserService workUserService;  // 근무 직원 서비스
    private final WorkTimeService workTimeService;  // 근무 시간 서비스
    private final WorkWeekService workWeekService;  // 근무 요일 서비스

    /**
     * 근무 그룹 리스트 조회
     * @param pagingVO
     * @return
     */
    public ResultVO selectWorkGroupList(PagingVO pagingVO) {
        return ResultVO.builder().data(workGroupDao.selectWorkGroupList(pagingVO)).build();
    }

    /**
     * 근무 그룹 명 중복 체크
     * @param workGroupNm
     * @return
     */
    public ResultVO selectDupleGroupNm(String workGroupNm) {
        if(workGroupDao.selectDupleGroupNm(workGroupNm) > 0) {
            throw new DuplicationException(CommonMsg.DUPLE_AUTH_GROUP_NM.getMsg());
        }
        return ResultVO.builder().resultMsg(CommonMsg.AVAILABLE_AUTH_GROUP_NM.getMsg()).build();
    }

    /**
     * 근무 그룹 저장
     * @param workGroupVO
     * @return
     */
    @Transactional
    public ResultVO insertWorkGroup(WorkGroupVO workGroupVO) {
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_WRITE.getMsg();
        ResultVO resultVO = ResultVO.builder().build();
        // 권한 그룹 등록이 성공했다면
        if(workGroupDao.insertWorkGroup(workGroupVO) > 0) {
            int workGroupId = workGroupVO.getWorkGroupId();
            if(workGroupVO.getWorkDeptList() != null) {
                for(WorkDeptVO workDeptVO : workGroupVO.getWorkDeptList()){
                    workDeptVO.setWorkGroupId(workGroupId);
                    resultVO = workDeptService.insertWorkDept(workDeptVO);
                    // 정상이 아니라면 에러 리턴하고 종료.
                    if(resultVO.getResult() != 0) {
                        //TODO throw Exception
                        return resultVO;
                    }
                }
            }
            if(workGroupVO.getWorkUserList() != null) {
                for(WorkUserVO workUserVO: workGroupVO.getWorkUserList()) {
                    workUserVO.setWorkGroupId(workGroupId);
                    resultVO = workUserService.insertWorkUser(workUserVO);
                    if(resultVO.getResult() != 0) {
                        //TODO throw Exception
                        return resultVO;
                    }
                }
            }

            for(WorkWeekVO workWeekVO : workGroupVO.getWorkWeekList()) {
                workWeekVO.setWorkGroupId(workGroupId);
                resultVO = workWeekService.insertWorkWeek(workWeekVO);
                if(resultVO.getResult() != 0) {
                    //TODO throw Exception
                    return resultVO;
                }
            }

            for(WorkTimeVO workTimeVO : workGroupVO.getWorkTimeList()) {
                workTimeVO.setWorkGroupId(workGroupId);
                resultVO = workTimeService.insertWorkTime(workTimeVO);
                if(resultVO.getResult() != 0) {
                    //TODO throw Exception
                    return resultVO;
                }
            }
         }
        resultVO.setResult(result);
        resultVO.setResultMsg(resultMsg);

        return resultVO;
    }
}
