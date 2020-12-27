package com.inno.ace.model.service.authgroup;

import com.inno.ace.model.vo.AuthGroupVO;
import com.inno.ace.model.vo.ResultVO;

public interface AuthGroupService {
    ResultVO selectDupleGroupNm(String authGroupNm);

    ResultVO insertAuthGroup(AuthGroupVO authGroupVO);

    ResultVO updateAuthGroup(AuthGroupVO authGroupVO);

    ResultVO deleteAuthGroup(int autuGroupId);

}
