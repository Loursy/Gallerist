package com.atakanunsever.controller;

import com.atakanunsever.dto.DtoAddress;
import com.atakanunsever.dto.DtoAddressIU;

public interface IRestAddressController {

	public RootEntity<DtoAddress> saveAddress(DtoAddressIU dtoAddressIU);
}
