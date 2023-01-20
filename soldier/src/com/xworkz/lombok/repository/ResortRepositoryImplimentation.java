package com.xworkz.lombok.repository;

import org.springframework.stereotype.Component;

import com.xworkz.lombok.DTO.ResortDTO;

@Component
public class ResortRepositoryImplimentation implements ResortRepository {

	public boolean value(ResortDTO dto) {
		System.out.println("Creating repository....");
		System.out.println("passing data" + dto);
		return false;
	}

}
