package com.atakanunsever.controller;

import com.atakanunsever.dto.DtoGallerist;
import com.atakanunsever.dto.DtoGalleristIU;

public interface IRestGalleristController {

	public RootEntity<DtoGallerist> saveGallerist(DtoGalleristIU dtoGalleristIU);
}
