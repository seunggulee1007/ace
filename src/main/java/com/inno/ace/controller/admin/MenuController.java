package com.inno.ace.controller.admin;

import com.inno.ace.model.service.admin.menu.MenuService;
import com.inno.ace.model.vo.common.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
