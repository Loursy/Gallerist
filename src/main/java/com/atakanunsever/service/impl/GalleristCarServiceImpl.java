package com.atakanunsever.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atakanunsever.dto.DtoAddress;
import com.atakanunsever.dto.DtoCar;
import com.atakanunsever.dto.DtoGallerist;
import com.atakanunsever.dto.DtoGalleristCar;
import com.atakanunsever.dto.DtoGalleristCartIU;
import com.atakanunsever.exception.BaseException;
import com.atakanunsever.exception.ErrorMessage;
import com.atakanunsever.exception.MessageType;
import com.atakanunsever.model.Car;
import com.atakanunsever.model.Gallerist;
import com.atakanunsever.model.GalleristCar;
import com.atakanunsever.repository.CarRepository;
import com.atakanunsever.repository.GalleristCarRepository;
import com.atakanunsever.repository.GalleristRepository;
import com.atakanunsever.service.IGalleristCarService;

@Service
public class GalleristCarServiceImpl implements IGalleristCarService {

	@Autowired
	private GalleristCarRepository galleristCarRepository;
	
	@Autowired
	private GalleristRepository galleristRepository;
	
	@Autowired
	private CarRepository carRepository;
	
	private GalleristCar createGalleristCar(DtoGalleristCartIU dtoGalleristCartIU) {
		
	 	Optional<Gallerist> optGallerist = galleristRepository.findById(dtoGalleristCartIU.getGalleristId());
		if(optGallerist.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristCartIU.getGalleristId().toString()));
		}
		
		Optional<Car> optCar = carRepository.findById(dtoGalleristCartIU.getCarId());
		if(optCar.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristCartIU.getCarId().toString()));
		}
	 	
		GalleristCar galleristCar = new GalleristCar();
		galleristCar.setCreateTime(new Date());
		galleristCar.setGallerist(optGallerist.get());
		galleristCar.setCar(optCar.get());
		
		return galleristCar;
	}
	
	@Override
	public DtoGalleristCar saveGalleristCar(DtoGalleristCartIU dtoGalleristCartIU) {
		DtoGalleristCar dtoGalleristCar = new DtoGalleristCar();
		DtoGallerist dtoGallerist = new DtoGallerist();
		DtoCar dtoCar = new DtoCar();
		
		DtoAddress dtoAddress = new DtoAddress();
		
		GalleristCar savedGalleristCar = galleristCarRepository.save(createGalleristCar(dtoGalleristCartIU));
		
		BeanUtils.copyProperties(savedGalleristCar, dtoGalleristCar);
		BeanUtils.copyProperties(savedGalleristCar.getGallerist(), dtoGallerist);
		BeanUtils.copyProperties(savedGalleristCar.getGallerist().getAddress(), dtoAddress);
		
		BeanUtils.copyProperties(savedGalleristCar.getCar(), dtoCar);
		
		dtoGallerist.setAddress(dtoAddress);
		dtoGalleristCar.setGallerist(dtoGallerist);
		dtoGalleristCar.setCar(dtoCar);
		
		return dtoGalleristCar;
	}

}
