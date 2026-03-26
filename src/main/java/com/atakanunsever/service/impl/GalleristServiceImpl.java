package com.atakanunsever.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atakanunsever.dto.DtoAddress;
import com.atakanunsever.dto.DtoGallerist;
import com.atakanunsever.dto.DtoGalleristIU;
import com.atakanunsever.exception.BaseException;
import com.atakanunsever.exception.ErrorMessage;
import com.atakanunsever.exception.MessageType;
import com.atakanunsever.model.Address;
import com.atakanunsever.model.Gallerist;
import com.atakanunsever.repository.AddressRepository;
import com.atakanunsever.repository.GalleristRepository;
import com.atakanunsever.service.IGalleristService;

@Service
public class GalleristServiceImpl implements IGalleristService{

	@Autowired
	private GalleristRepository galleristRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	private Gallerist createGallerist(DtoGalleristIU dtoGalleristIU) {
		Optional<Address> optAddres = addressRepository.findById(dtoGalleristIU.getAddressId());
		if(optAddres.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristIU.getAddressId().toString()));
		}
		
		Gallerist gallerist = new Gallerist();
		gallerist.setCreateTime(new Date());
		
		BeanUtils.copyProperties(dtoGalleristIU, gallerist);
		gallerist.setAddress(optAddres.get());
	
		return gallerist;
	}
	
	@Override
	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU) {
		DtoGallerist dtoGallerist = new DtoGallerist();
		DtoAddress dtoAddress = new DtoAddress();
		Gallerist savedGallerist = galleristRepository.save(createGallerist(dtoGalleristIU));
		
		BeanUtils.copyProperties(savedGallerist, dtoGallerist);
		BeanUtils.copyProperties(savedGallerist.getAddress(), dtoAddress);
		
		dtoGallerist.setAddress(dtoAddress);
;		return dtoGallerist;
	}

	
}
