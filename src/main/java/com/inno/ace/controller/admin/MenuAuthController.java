package com.inno.ace.controller.admin;

import com.inno.ace.model.service.admin.menuauth.MenuAuthService;
import com.inno.ace.model.vo.admin.MenuAuthVO;
import com.inno.ace.model.vo.common.ResultVO;
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
