package com.atakanunsever.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atakanunsever.controller.IRestAddressController;
import com.atakanunsever.controller.RestBaseController;
import com.atakanunsever.controller.RootEntity;
import com.atakanunsever.dto.DtoAddress;
import com.atakanunsever.dto.DtoAddressIU;
import com.atakanunsever.service.IAddressService;

import jakarta.validation.Valid;
import lombok.val;

@RestController
@RequestMapping("/rest/api/address")
public class RestAddressControllerImpl extends RestBaseController implements IRestAddressController{

	@Autowired
	private IAddressService addressService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoAddress> saveAddress(@Valid @RequestBody DtoAddressIU dtoAddressIU) {
		return ok(addressService.saveAddress(dtoAddressIU));
	}

}
