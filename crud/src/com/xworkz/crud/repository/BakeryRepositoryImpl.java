package com.xworkz.crud.repository;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.exception.SizeExceedException;

public class BakeryRepositoryImpl implements BakeryRepository {
	private BakeryDTO[] dtos = new BakeryDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean store(BakeryDTO dto) throws SizeExceedException {
		System.out.println("running the dtos");
		if (currentIndex >= dtos.length) {
			System.out.println("bekary size to be full   ..../cheking");
			throw new SizeExceedException("Bekary size is exceeded....");

		}
		this.dtos[this.currentIndex] = dto;
		this.currentIndex++;

		return true;
	}

}
