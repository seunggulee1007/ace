package com.inno.ace.model.service.user;

import com.inno.ace.advice.exception.AlreadyMemberException;
import com.inno.ace.model.vo.ResultVO;
import com.inno.ace.model.vo.UserVO;

public interface UserService {

    public ResultVO signUp(UserVO userVO) throws AlreadyMemberException;
    
    public ResultVO signIn(UserVO userVO);
    
    public ResultVO chgPwd(UserVO userVO);
    
}
