package com.xworkz.lombok.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;

import com.xworkz.lombok.DTO.FirstAidDTO;
import com.xworkz.lombok.DTO.MissileDTO;
import com.xworkz.lombok.repository.FirstAidRepository;
import com.xworkz.lombok.repository.MissileRepository;

@Component
public class FirstAidServiceImplementation implements FirstAidService {
	private FirstAidRepository firstAidRepository;
	private Validator validator;

	public FirstAidServiceImplementation(MissileRepository missileRepository, Validator validator) {
		super();
		this.firstAidRepository = firstAidRepository;
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("Passing data is to valiadate...");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FirstAidDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.err.println("at DTO having errors");

			violations.forEach(v -> System.out.println(v.getMessage()));
			return false;
		} else {
			System.out.println("their is no errors found in Dto");
			boolean value = FirstAidRepository.value(dto);
			System.out.println("data value" + value);
			return value;
		}
	}
}
