package com.xworkz.lombok.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;

import com.xworkz.lombok.DTO.ResortDTO;
import com.xworkz.lombok.DTO.SoldierDTO;
import com.xworkz.lombok.repository.ResortRepository;

@Component
public class ResortServiceImplementation implements ResortService {
	private ResortRepository resortRepository;
	private Validator validator;

	public ResortServiceImplementation(ResortRepository resortRepository, Validator validator) {
		super();
		this.resortRepository = resortRepository;
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Passing data is to validate....");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ResortDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.err.println("at DTO having errors");

			violations.forEach(v -> System.out.println(v.getMessage()));
			return false;
		} else {
			System.out.println("their is no errors found in dto");
			boolean value = ResortRepository.value(dto);
			System.out.println(" data value" + value);
			return value;

		}

	}
}
