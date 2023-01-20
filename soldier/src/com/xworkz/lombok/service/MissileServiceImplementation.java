package com.xworkz.lombok.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;

import com.xworkz.lombok.DTO.MissileDTO;
import com.xworkz.lombok.DTO.ResortDTO;
import com.xworkz.lombok.repository.MissileRepository;
import com.xworkz.lombok.repository.ResortRepository;

@Component
public class MissileServiceImplementation implements MissileService {
	private MissileRepository missileRepository;
	private Validator validator;

	public MissileServiceImplementation(MissileRepository missileRepository, Validator validator) {
		super();
		this.missileRepository = missileRepository;
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("Passing data is to valiadate...");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<MissileDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.err.println("at DTO having errors");

			violations.forEach(v -> System.out.println(v.getMessage()));
			return false;
		} else {
			System.out.println("their is no errors found in Dto");
			boolean value = MissileRepository.value(dto);
			System.out.println("data value" + value);
			return value;
		}
	}
}
