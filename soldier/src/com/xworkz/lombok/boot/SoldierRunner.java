package com.xworkz.lombok.boot;

import com.xworkz.lombok.DTO.SoldierDTO;
import com.xworkz.lombok.repository.SoldierRepository;
import com.xworkz.lombok.repository.SoldierRepositoryImplementation;
import com.xworkz.lombok.service.SoldierServiceImplementation;

public class SoldierRunner {

	public static void main(String[] args) {

		SoldierDTO dto = new SoldierDTO("Sandeep UnniKrishnan", "Kozhikode", 31, "Operation Vijay", "Indian Army",
				"National Defence Academy", 1999_2000);

		SoldierServiceImplementation service = new SoldierServiceImplementation();

		SoldierRepository repository = new SoldierRepositoryImplementation();
		service.setSoldierRepository(repository);
		//service.validateAndSave(soldierdto);

	}

}
