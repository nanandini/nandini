package com.xworkz.lombok.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.lombok.DTO.SoldierDTO;
import com.xworkz.lombok.repository.SoldierRepository;

import lombok.Setter;

public class SoldierServiceImplementation implements SoldierService {

	private SoldierRepository soldierRepository;

	public SoldierServiceImplementation() {
		System.out.println("excuting the soldierServiceImplements....");
	}

	public void setSoldierRepository(SoldierRepository soldierRepository) {
		this.soldierRepository = soldierRepository;
	}

	@Override
	public boolean validateAndSave(SoldierDTO soldierdto) {
		System.out.println("starting validateandsave");
		System.out.println("given data from Dto method=" + soldierdto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(soldierdto);
		if (!violations.isEmpty()) {
			System.err.println("at DTO having errors");

			violations.forEach(v -> System.out.println(v.getMessage()));
			return false;

		} else {
			System.out.println("their is no errors found in dto");
			boolean counts = SoldierRepository.counts(soldierdto);
			System.out.println("validating the given data in dto in the repository" + counts);
		}

		return true;
	}

}
