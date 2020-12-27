package com.inno.ace.controller;

import com.inno.ace.model.service.authgroup.AuthGroupService;
import com.inno.ace.model.vo.AuthGroupVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/authGroup")
public class AuthGroupController {

    private final AuthGroupService authGroupService;

    @GetMapping("/confirmDuple/{authGroupNm}")
    public ResultVO confirmDuple(@PathVariable String authGroupNm) {
        return authGroupService.selectDupleGroupNm(authGroupNm);
    }

    @PostMapping
    public ResultVO insertAuthGroup(AuthGroupVO authGroupVO) {
        return authGroupService.insertAuthGroup(authGroupVO);
    }

    @PutMapping
    public ResultVO updateAuthGroup(AuthGroupVO authGroupVO) {
        return authGroupService.updateAuthGroup(authGroupVO);
    }

    @DeleteMapping("/{authgroupId}")
    public ResultVO deleteAuthGroup(int authGroupId){
        return authGroupService.deleteAuthGroup(authGroupId);
    }

}
