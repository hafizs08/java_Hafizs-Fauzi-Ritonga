package com.section27.demo.service;

import javax.servlet.http.HttpServletRequest;

import com.section27.demo.entity.PhoneResponse;
import com.section27.demo.entity.TokenResponse;
import com.section27.demo.entity.User;
import com.section27.demo.entity.UsernamePassword;

public interface AuthService {
    User register(UsernamePassword req);
    TokenResponse generateToken(UsernamePassword req);
    PhoneResponse generatePhone(HttpServletRequest request) ;
}
