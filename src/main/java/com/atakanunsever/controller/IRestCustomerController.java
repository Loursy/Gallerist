package com.atakanunsever.controller;

import com.atakanunsever.dto.DtoCustomer;
import com.atakanunsever.dto.DtoCustomerIU;

public interface IRestCustomerController {

	public RootEntity<DtoCustomer> saveCustomer(DtoCustomerIU dtoCustomerIU);
}
