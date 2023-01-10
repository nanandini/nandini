package com.xworkz.crudOperationException.service;

import com.xworkz.crudOperationException.dto.PizzaDTO;

public interface PizzaService {
	
	boolean pizzaServices(PizzaDTO dto);

	void validateAndSave(PizzaDTO pizza);

}
