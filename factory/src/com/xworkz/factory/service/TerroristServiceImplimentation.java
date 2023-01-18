package com.xworkz.factory.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.factory.Dto.TerroristDto;

public class TerroristServiceImplimentation implements TerroristService {

	@Override
	public boolean validateAndSaved(TerroristDto terroristdto) {
		System.out.println("validation process....");
		System.out.println("Creating a DTO method.....");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator valide = factory.getValidator();
		Set<ConstraintViolation<TerroristDto>> violation = valide.validate(terroristdto);
		if (!violation.isEmpty()) {
			System.err.println("created an error ");
			violation.forEach(ele -> System.out.println(ele.getMessage()));
			return false;
		}
		System.out.println("No validation errors will be occur" + terroristdto);
		return true;
	}

}
