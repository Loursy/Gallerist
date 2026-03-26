package com.atakanunsever.controller;

import com.atakanunsever.dto.DtoCar;
import com.atakanunsever.dto.DtoCarIU;

public interface IRestCarController {

	public RootEntity<DtoCar> saveCar(DtoCarIU dtoCarIU);
}
