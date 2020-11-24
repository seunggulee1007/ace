package com.inno.ace.model.service.biz;

import com.inno.ace.model.vo.ResultVO;

import java.io.IOException;

public interface BizService {

    public ResultVO getBizInfo(String bizNo) throws IOException;
    
}
