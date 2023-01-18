package com.xworkz.lombok.repository;

import com.xworkz.lombok.DTO.SoldierDTO;

public class SoldierRepositoryImplementation implements SoldierRepository {
	public SoldierRepositoryImplementation() {
		System.out.println("creating the SoldierRepositoryImplementation... ");
	}

	public boolean counts(SoldierDTO soldierdto) {
		return true;
	}
}