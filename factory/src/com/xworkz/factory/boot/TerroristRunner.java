package com.xworkz.factory.boot;

import com.xworkz.factory.Dto.TerroristDto;
import com.xworkz.factory.service.TerroristService;
import com.xworkz.factory.service.TerroristServiceImplimentation;

public class TerroristRunner {

	public static void main(String[] args) {

		TerroristDto value = new TerroristDto();
		value.setName("Kiran");
		value.setAge(31);
		value.setCountry("India");
		value.setOrganisation("Medical");
		value.setAlive(true);
		value.setPrison(false);
		System.out.println(value);
		TerroristService service = new TerroristServiceImplimentation();
		service.validateAndSaved(value);
	}

}
