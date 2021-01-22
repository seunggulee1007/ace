package com.inno.ace.model.service.common.security;

import com.inno.ace.advice.exception.NoMemberException;
import com.inno.ace.model.dao.ace.common.UserDao;
import com.inno.ace.model.vo.common.UserDetailVO;
import com.inno.ace.model.vo.common.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomUserDetailService implements UserDetailsService {

    private final UserDao userDao;
    
    public UserDetails loadUserByUsername(String userPk) {
         UserVO userVO = userDao.selectUser(userPk).orElseThrow(NoMemberException::new);
         UserDetailVO user = UserDetailVO.builder().build();
         user.setUserId(userVO.getUserId());
         user.setPassword(userVO.getPassword());
         return user;
    }
}
