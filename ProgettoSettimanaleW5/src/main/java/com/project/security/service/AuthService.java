package com.project.security.service;

import com.project.security.payload.LoginDto;
import com.project.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
