package com.atakanunsever.service;

import com.atakanunsever.dto.DtoAccount;
import com.atakanunsever.dto.DtoAccountIU;

public interface IAccountService {

	public DtoAccount saveAccount(DtoAccountIU dtoAccountIU);
}
