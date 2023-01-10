package com.xworkz.crudOperationException.service;

import com.xworkz.crudOperationException.constant.PizzaSize;
import com.xworkz.crudOperationException.dto.PizzaDTO;

public class PizzaServiceImplimentation implements PizzaService {

	@Override
	public boolean pizzaServices(PizzaDTO dto) {
		System.out.println("validating method");
		String name = dto.getName(); // not null, >4 <20
		String companyName = dto.getCompanyName();
		PizzaSize size = dto.getSize();
		String type = dto.getType();
		double price = dto.getPrize();

		boolean validateName = false;
		boolean validateCompanyName = false;
		boolean validateSize = false;
		boolean validateType = false;
		boolean validatePrice = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("valid name");
			validateName = true;
		}
		return false;
	}

	@Override
	public void validateAndSave(PizzaDTO pizza) {
		System.out.println("running method going to be end");
	}

}