package com.xworkz.lombok.repository;

import org.springframework.stereotype.Component;

import com.xworkz.lombok.DTO.MissileDTO;

@Component
public class FirstAidRepositoryImplimentation implements FirstAidRepository {
	public <FirstAidDTO> boolean value(FirstAidDTO dto) {
		System.out.println("Creating repository....");
		System.out.println("passing data" + dto);
		return false;

	}

}
