package com.inno.ace.controller;

import com.inno.ace.model.service.menu.MenuService;
import com.inno.ace.model.vo.MenuVO;
import com.inno.ace.model.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/innoApi")
public class ApiController {

    private final MenuService menuService;

    @PostMapping("/syncMenu")
    @ApiOperation(value="메뉴 등록", notes="메뉴 등록")
    public ResultVO syncMenu(@RequestBody List<MenuVO> menuList) throws Exception {
        System.out.println("menuList :: " + menuList);
        return menuService.syncMenu(menuList);
    }

    @GetMapping("/syncMenuDelete")
    @ApiOperation(value="메뉴 삭제", notes="슈퍼관리자에서 사용여부를 N으로 한 메뉴 삭제")
    public ResultVO syncMenuDelete(int menuId) {
        return menuService.deleteMenu(menuId);
    }
}
