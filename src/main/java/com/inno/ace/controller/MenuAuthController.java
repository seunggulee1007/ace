package com.inno.ace.controller;

import com.inno.ace.model.service.menuauth.MenuAuthService;
import com.inno.ace.model.vo.MenuAuthVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/menuAuth")
@RestController
public class MenuAuthController {
    private final MenuAuthService menuAuthService;

    @PostMapping
    public ResultVO insertMenuAuth(MenuAuthVO menuAuthVO) {
        return menuAuthService.insertMenuAuth(menuAuthVO);
    }

    @PutMapping
    public ResultVO updateMenuAuth(MenuAuthVO menuAuthVO) {
        return menuAuthService.updateMenuAuth(menuAuthVO);
    }

}