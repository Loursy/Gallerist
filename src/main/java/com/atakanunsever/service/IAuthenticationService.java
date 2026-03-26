package com.atakanunsever.service;

import com.atakanunsever.dto.AuthRequest;
import com.atakanunsever.dto.AuthResponse;
import com.atakanunsever.dto.DtoUser;
import com.atakanunsever.dto.RefreshTokenRequest;

public interface IAuthenticationService {

	public DtoUser register(AuthRequest input);
	
	public AuthResponse authenticate(AuthRequest input);
	
	public AuthResponse refreshToken(RefreshTokenRequest input);
}
