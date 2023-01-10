package com.xworkz.crud.repository;

import com.xworkz.crud.dto.PlaceDTO;
import com.xworkz.crud.exception.SizeExceedException;

public class PlaceRepositoryImpl implements PlaceRepsitory {
	private PlaceDTO[] dtos = new PlaceDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean store(PlaceDTO dto) throws SizeExceedException {
		System.out.println("running the dtos");
		if (currentIndex >= dtos.length) {
			System.out.println("Place size to be full   ..../cheking");
			throw new SizeExceedException("Place size is exceeded....");

		}
		this.dtos[this.currentIndex] = dto;
		this.currentIndex++;

		return true;
	}

}



