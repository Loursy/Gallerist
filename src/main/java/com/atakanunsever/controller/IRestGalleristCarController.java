package com.atakanunsever.controller;

import com.atakanunsever.dto.DtoGalleristCar;
import com.atakanunsever.dto.DtoGalleristCartIU;

public interface IRestGalleristCarController {

	public RootEntity<DtoGalleristCar> saveGalleristCar(DtoGalleristCartIU dtoGalleristCartIU);
}
