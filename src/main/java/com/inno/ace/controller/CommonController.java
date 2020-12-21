package com.inno.ace.controller;

import com.inno.ace.model.service.menu.MenuService;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/common")
public class CommonController {

    private final MenuService menuService;
    @GetMapping("/menuList")
    public ResultVO selectMenuList() {
        return menuService.selectRouterMenuList();
    }

}
