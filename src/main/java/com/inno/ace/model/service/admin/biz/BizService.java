package com.inno.ace.model.service.admin.biz;

import com.inno.ace.model.vo.common.ResultVO;

import java.io.IOException;

public interface BizService {

    public ResultVO getBizInfo(String bizNo) throws IOException;
    
}
