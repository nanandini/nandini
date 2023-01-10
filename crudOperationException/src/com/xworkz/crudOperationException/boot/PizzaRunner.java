package com.xworkz.crudOperationException.boot;

import java.time.LocalDateTime;

import com.xworkz.crudOperationException.constant.PizzaSize;
import com.xworkz.crudOperationException.dto.PizzaDTO;
import com.xworkz.crudOperationException.service.PizzaService;
import com.xworkz.crudOperationException.service.PizzaServiceImplimentation;

public class PizzaRunner {

	private static final PizzaDTO dto = null;

	public static void main(String[] args) {
		
		PizzaDTO pizza=new PizzaDTO();
		pizza.setCreatedBy("System");
		pizza.getCreateDate();
		PizzaService service=new PizzaServiceImplimentation();
	    service.validateAndSave(pizza);
	    System.out.println(pizza.getCreatedBy());
	    System.out.println(pizza.getCreateDate());
	}

}
