package com.atakanunsever.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atakanunsever.controller.IRestGalleristCarController;
import com.atakanunsever.controller.RestBaseController;
import com.atakanunsever.controller.RootEntity;
import com.atakanunsever.dto.DtoGalleristCar;
import com.atakanunsever.dto.DtoGalleristCartIU;
import com.atakanunsever.service.IGalleristCarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/rest/api/gallerist-car")
public class RestGalleristCarControllerImpl extends RestBaseController implements IRestGalleristCarController{

	@Autowired
	private IGalleristCarService galleristCarService;
	
	@PostMapping("/save")
	@Override
	public RootEntity<DtoGalleristCar> saveGalleristCar(@Valid @RequestBody DtoGalleristCartIU dtoGalleristCartIU) {
		return ok(galleristCarService.saveGalleristCar(dtoGalleristCartIU));
	}

}
