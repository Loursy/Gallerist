package com.atakanunsever.service;

import com.atakanunsever.dto.DtoCustomer;
import com.atakanunsever.dto.DtoCustomerIU;

public interface ICustomerService {

	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU);
}
