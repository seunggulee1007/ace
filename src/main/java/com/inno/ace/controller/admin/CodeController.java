package com.inno.ace.controller.admin;

import com.inno.ace.model.service.admin.codeMaster.CodeMasterService;
import com.inno.ace.model.vo.admin.CodeMasterVO;
import com.inno.ace.model.vo.common.PagingVO;
import com.inno.ace.model.vo.common.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/code/")
public class CodeController {

    private final CodeMasterService codeMasterService;

    @ApiOperation(value="코드 마스터 조회", notes = "코드 마스터 리스트 조회")
    @GetMapping("/selectCodeMasterList")
    public ResultVO selectCodeMasterList(PagingVO pagingVO) {
        return codeMasterService.selectCodeMasterList(pagingVO);
    }

    @ApiOperation(value="코드 마스터 저장", notes="코드 마스터 정보 저장")
    @PostMapping("/insertCodeMaster")
    public ResultVO insertCodeMaster(CodeMasterVO codeMasterVO) {
        return codeMasterService.insertCodeMaster(codeMasterVO);
    }

    @ApiOperation(value="코드 마스터 수정", notes="코드 마스터 정보 수정")
    @PutMapping("/updateCodeMaster")
    public ResultVO updateCodeMaster(CodeMasterVO codeMasterVO) {
        return codeMasterService.updateCodeMaster(codeMasterVO);
    }

    @ApiOperation(value="코드 마스터 삭제", notes="넘겨진 아이디로 코드 마스터 삭제")
    @DeleteMapping("/deteleCodeMaster")
    public ResultVO deleteCodeMaster(int codeMasterId) {
        return codeMasterService.deleteCodeMaster(codeMasterId);
    }

}
