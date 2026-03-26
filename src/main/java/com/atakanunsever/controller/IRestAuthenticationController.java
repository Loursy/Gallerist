package com.atakanunsever.controller;

import com.atakanunsever.dto.AuthRequest;
import com.atakanunsever.dto.AuthResponse;
import com.atakanunsever.dto.DtoUser;
import com.atakanunsever.dto.RefreshTokenRequest;
import com.atakanunsever.model.RefreshToken;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);
	
	public RootEntity<AuthResponse> authenticate(AuthRequest input);
	
	public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);
}
