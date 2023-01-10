package com.xworkz.crud.boot.boot;


import com.xworkz.crud.dto.TheaterDTO;
import com.xworkz.crud.exception.StorageInvalidExeception;
import com.xworkz.crud.repository.TheaterRepository;
import com.xworkz.crud.repository.TheaterRepositoryImpl;
import com.xworkz.crud.service.TheaterService;
import com.xworkz.crud.service.TheaterServiceImpl;

public class TheaterRunner {

	public static void main(String[] args) {
		System.out.println("Starting of main Running Theater");

		TheaterDTO dto = new TheaterDTO("Navarang", 11, "HighQuality", 450);
		TheaterDTO dto1 = new TheaterDTO("Balaji", 100, "MIddle ", 250);
		TheaterDTO dto2 = new TheaterDTO("Krishnan", 103, "Low", 150);
		TheaterDTO dto3 = new TheaterDTO("radhaKrishna", 104, "VeryPoor", 660);
		TheaterDTO dto4 = new TheaterDTO("galerian ", 105, "VeryHigh", 600);
		TheaterRepositoryImpl theaterrepository = new TheaterRepositoryImpl();
		TheaterService theaterService= new TheaterServiceImpl();
		boolean value = theaterService.validateAndSaveData(dto);
		System.out.println(value);
		boolean value1 = theaterService.validateAndSaveData(dto1);
		System.out.println(value1);

		boolean value2 = theaterService.validateAndSaveData(dto2);
		System.out.println(value2);

		boolean value3 = theaterService.validateAndSaveData(dto3);
		System.out.println(value3);
		System.out.println("successfull theater runner at the end");
	}

}