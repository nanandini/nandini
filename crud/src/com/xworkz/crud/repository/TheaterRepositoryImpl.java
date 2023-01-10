package com.xworkz.crud.repository;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.dto.TheaterDTO;
import com.xworkz.crud.exception.SizeExceedException;

public class TheaterRepositoryImpl implements TheaterRepository {
	private TheaterDTO[] dtos = new TheaterDTO[5];
	private int currentIndex = 0;

	public boolean store(TheaterDTO dto) throws SizeExceedException {
		System.out.println("running the dtos");
		if (currentIndex >= this.dtos.length) {
			System.out.println("Thearter size to be full   ..../cheking");
			throw new SizeExceedException("Theater size is exceeded....");

		}
		this.dtos[this.currentIndex] = dto;
		this.currentIndex++;

		return true;

	}

}
