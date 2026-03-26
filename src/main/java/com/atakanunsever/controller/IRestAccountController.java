package com.atakanunsever.controller;

import com.atakanunsever.dto.DtoAccount;
import com.atakanunsever.dto.DtoAccountIU;

public interface IRestAccountController {

	public RootEntity<DtoAccount> saveAccount(DtoAccountIU dtoAccountIU);
}
