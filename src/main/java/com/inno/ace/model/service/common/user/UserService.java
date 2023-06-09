package com.inno.ace.model.service.common.user;

import com.inno.ace.advice.exception.AlreadyMemberException;
import com.inno.ace.model.vo.common.ResultVO;
import com.inno.ace.model.vo.common.UserVO;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    ResultVO selectUserList(int deptCd);

    ResultVO signUp(UserVO userVO) throws AlreadyMemberException;
    
    ResultVO signIn(UserVO userVO);
    
    ResultVO chgPwd(UserVO userVO);

    ResultVO insertUser(HttpServletRequest request, UserVO userVO);

    ResultVO updateUser(HttpServletRequest request, UserVO userVO);

}
