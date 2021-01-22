package com.inno.ace.controller;

import com.inno.ace.model.service.admin.codeMaster.CodeMasterService;
import com.inno.ace.model.service.admin.menu.MenuService;
import com.inno.ace.model.vo.admin.CodeMasterVO;
import com.inno.ace.model.vo.admin.MenuVO;
import com.inno.ace.model.vo.common.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/innoApi")
public class ApiController {

    private final MenuService menuService;
    private final CodeMasterService codeMasterService;

    @PostMapping("/syncMenu")
    @ApiOperation(value="메뉴 등록", notes="메뉴 등록")
    public ResultVO syncMenu(@RequestBody List<MenuVO> menuList) throws Exception {
        return menuService.syncMenu(menuList);
    }

    @GetMapping("/syncMenuDelete")
    @ApiOperation(value="메뉴 삭제", notes="슈퍼관리자에서 사용여부를 N으로 한 메뉴 삭제")
    public ResultVO syncMenuDelete(int menuId) {
        return menuService.deleteMenu(menuId);
    }

    @PostMapping("/syncCode")
    @ApiOperation(value="코드 등록", notes="슈퍼관리자에서 등록한 코드들 동기화")
    public ResultVO syncCode(@RequestBody List<CodeMasterVO> codeMasterList) throws Exception {
        return codeMasterService.syncCodeMaster(codeMasterList);
    }
}
