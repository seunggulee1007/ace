package com.inno.ace.controller;

import com.inno.ace.model.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class CommuteController {

    public ResultVO getToWork() {

        return ResultVO.builder().build();
    }
}
