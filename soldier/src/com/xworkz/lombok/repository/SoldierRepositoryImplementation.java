package com.xworkz.lombok.repository;

import org.springframework.stereotype.Component;

import com.xworkz.lombok.DTO.SoldierDTO;

@Component
public class SoldierRepositoryImplementation implements SoldierRepository {
	public SoldierRepositoryImplementation() {
		System.out.println("creating the SoldierRepositoryImplementation... ");
	}

	public boolean counts(SoldierDTO soldierdto) {
		return true;
	}
}