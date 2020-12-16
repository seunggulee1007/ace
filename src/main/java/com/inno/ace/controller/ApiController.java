package com.inno.ace.controller;

import com.inno.ace.model.service.menu.MenuService;
import com.inno.ace.model.vo.MenuVO;
import com.inno.ace.model.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/innoApi")
public class ApiController {

    private final MenuService menuService;

    @PostMapping("/syncMenu")
    @ApiOperation(value="메뉴 등록", notes="메뉴 등록")
    public ResultVO syncMenu(MenuVO menuVO) throws Exception {
        return menuService.syncMenu(menuVO);
    }
}
