package com.inno.ace.controller.flexibleWork;

import com.inno.ace.model.service.work.workgroup.WorkGroupService;
import com.inno.ace.model.vo.common.PagingVO;
import com.inno.ace.model.vo.common.ResultVO;
import com.inno.ace.model.vo.flexibleWork.WorkGroupVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/workGroup")
public class WorkGroupController {

    private final WorkGroupService workGroupService;

    @GetMapping("/list")
    public ResultVO selectWorkGroupList(PagingVO pagingVO) {
        return workGroupService.selectWorkGroupList(pagingVO);
    }

    /**
     * 근무 그룹명 중복 체크
     * @param workGroupNm
     * @return
     */
    @GetMapping("/dupleGroupNm/{workGroupNm}")
    public ResultVO dupleGroupNm(@PathVariable String workGroupNm) {
        return workGroupService.selectDupleGroupNm(workGroupNm);
    }

    /**
     * 근무 그룹 등록
     * @param workGroupVO
     * @return
     */
    @PostMapping
    public ResultVO insertWorkGroup(WorkGroupVO workGroupVO) {
        return workGroupService.insertWorkGroup(workGroupVO);
    }

}
