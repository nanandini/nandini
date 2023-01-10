package com.xworkz.crud.boot;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.exception.StorageInvalidExeception;
import com.xworkz.crud.repository.BakeryRepository;
import com.xworkz.crud.repository.BakeryRepositoryImpl;
import com.xworkz.crud.service.BekaryService;
import com.xworkz.crud.service.BekaryServiceImpl;

public class BekaryRunner {

	public static void main(String[] args) {

		System.out.println("Starting of main Running Bekary ");
		BakeryDTO dto = new BakeryDTO("Krishnan bakery", "krishna", "Gowribidanur", 9448958488L);
		BakeryDTO dto1 = new BakeryDTO("Vinayak bekary", "vinaya", "chikkabalpur", 9428858634L);
		BakeryDTO dto2 = new BakeryDTO("RR bakery", "vinutha", "R T nagar", 9258958808L);
		BakeryDTO dto3 = new BakeryDTO("padmini bakery", "shri krishna", "kolar", 9448658980L);
		BakeryDTO dto4 = new BakeryDTO("radha bakery", "srisirra", "Mysore", 9245958498L);

		BakeryRepository bakeryRepository = new BakeryRepositoryImpl();

		BekaryService bekaryService = new BekaryServiceImpl(bakeryRepository);

		try {
			boolean data1 = bekaryService.validateAndSave(dto);
			System.out.println(data1);
			boolean data2 = bekaryService.validateAndSave(dto);
			System.out.println(data2);
			boolean data3 = bekaryService.validateAndSave(dto);
			System.out.println(data3);
			boolean data4 = bekaryService.validateAndSave(dto);
			System.out.println(data4);
			boolean data5 = bekaryService.validateAndSave(dto);
			System.out.println(data5);
			// bekaryService.validateAndSave(dto);

		} catch (StorageInvalidExeception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("successfull bekery runner at the end");
	}
}