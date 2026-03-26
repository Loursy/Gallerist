package com.atakanunsever.service;

import com.atakanunsever.dto.DtoAddress;
import com.atakanunsever.dto.DtoAddressIU;

public interface IAddressService {

	public DtoAddress saveAddress(DtoAddressIU dtoAddressIU);
}
