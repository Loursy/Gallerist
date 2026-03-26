package com.atakanunsever.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atakanunsever.controller.IRestAuthenticationController;
import com.atakanunsever.controller.RestBaseController;
import com.atakanunsever.controller.RootEntity;
import com.atakanunsever.dto.AuthRequest;
import com.atakanunsever.dto.AuthResponse;
import com.atakanunsever.dto.DtoUser;
import com.atakanunsever.dto.RefreshTokenRequest;
import com.atakanunsever.service.IAuthenticationService;

import jakarta.validation.Valid;

@RestController
public class RestAuthenticationControllerImpl extends RestBaseController implements IRestAuthenticationController{

	@Autowired
	private IAuthenticationService authenticationService;
	
	@PostMapping("/register")
	public RootEntity<DtoUser> register(@Valid @RequestBody AuthRequest ioput) {
		return ok(authenticationService.register(ioput));
	}

	@PostMapping("/authenticate")
	@Override
	public RootEntity<AuthResponse> authenticate(@Valid @RequestBody AuthRequest input) {
		return ok(authenticationService.authenticate(input));
	}

	@PostMapping("/refreshToken")
	@Override
	public RootEntity<AuthResponse> refreshToken(@Valid @RequestBody RefreshTokenRequest input) {
		return ok(authenticationService.refreshToken(input));
	}
}
