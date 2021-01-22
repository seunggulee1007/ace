package com.inno.ace.controller.admin;

import com.inno.ace.model.service.admin.dept.DeptService;
import com.inno.ace.model.vo.admin.DeptVO;
import com.inno.ace.model.vo.common.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/dept")
@RequiredArgsConstructor
@RestController
public class DeptController {

    private final DeptService deptService;
    @GetMapping("/deptList")
    public ResultVO selectDeptList(){
        return deptService.selectDeptList();
    }
    @PostMapping
    @ApiOperation(value="부서 등록", notes="부서 등록")
    public ResultVO insertDept(DeptVO deptVO) {
        return deptService.insertDept(deptVO);
    }

    @GetMapping("/{deptId}")
    public ResultVO selectMenu(@PathVariable int deptId){
        return deptService.selectDept(deptId);
    }

    @PutMapping
    @ApiOperation(value="부서 수정", notes="부서 수정")
    public ResultVO updateDept(DeptVO deptVO) {
        return deptService.updateDept(deptVO);
    }

    @DeleteMapping("/{deptId}")
    public ResultVO deleteDept(@PathVariable int deptId) {
        return deptService.deleteDept(deptId);
    }

    @PutMapping("/moveDept/{gu}/{ord}/{parDeptId}")
    public ResultVO moveDept(@PathVariable int gu, @PathVariable int ord, @PathVariable int parDeptId) {
        return deptService.updateOrd(gu, ord, parDeptId);
    }

}
