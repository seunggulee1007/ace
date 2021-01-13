package com.inno.ace.util;

import com.inno.ace.config.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
public class AuthUtil {
    private final JwtTokenProvider jwtTokenProvider;

    public String getLoginId() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String token = request.getHeader("X_AUTH_TOKEN");
        return jwtTokenProvider.getUserId(token);
    }
}
