package com.atakanunsever.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoGalleristCartIU {

	@NotNull
	private Long galleristId;
	
	@NotNull
	private Long carId;
}
