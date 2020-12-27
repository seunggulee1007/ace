package com.inno.ace.controller;

import com.inno.ace.model.service.menu.MenuService;
import com.inno.ace.model.vo.MenuVO;
import com.inno.ace.model.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/menu")
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/menuList")
    public ResultVO selectMenuList() {
        return menuService.selectMenuList();
    }

    @GetMapping("/{menuId}")
    public ResultVO selectMenu(@PathVariable int menuId){
        return menuService.selectMenu(menuId);
    }

    @GetMapping("/authMenuList/{menuId}")
    public ResultVO selectAuthMenuList(@PathVariable int menuId) { return menuService.selectAuthMenuList(menuId); }

    @PutMapping("/moveMenu/{gu}/{ord}/{menuId}")
    public ResultVO moveMenu(@PathVariable int gu, @PathVariable int ord, @PathVariable int menuId) {
        return menuService.updateOrd(gu, ord, menuId);
    }

}
