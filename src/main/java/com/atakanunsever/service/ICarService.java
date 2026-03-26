package com.atakanunsever.service;

import com.atakanunsever.dto.DtoCar;
import com.atakanunsever.dto.DtoCarIU;

public interface ICarService {

	public DtoCar saveCar(DtoCarIU dtoCarIU);
}
