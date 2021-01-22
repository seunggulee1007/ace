package com.inno.ace.controller.common;

import com.inno.ace.model.service.common.user.UserService;
import com.inno.ace.model.vo.common.ResultVO;
import com.inno.ace.model.vo.common.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/userList/{deptId}")
    public ResultVO selectUserList(@PathVariable int deptId){
        return userService.selectUserList(deptId);
    }

    @PostMapping
    public ResultVO insertUser(HttpServletRequest request, UserVO userVO) {
        return userService.insertUser(request, userVO);
    }

    @PutMapping
    public ResultVO updateUser(HttpServletRequest request, UserVO userVO) {
        return userService.updateUser(request, userVO);
    }

}
