package com.xworkz.crud.boot.boot;

import com.xworkz.crud.dto.PlaceDTO;
import com.xworkz.crud.exception.StorageInvalidExeception;
import com.xworkz.crud.repository.PlaceRepositoryImpl;
import com.xworkz.crud.repository.PlaceRepsitory;
import com.xworkz.crud.service.PlaceService;
import com.xworkz.crud.service.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {

		System.out.println("Starting of main Running Place");
		PlaceDTO dto = new PlaceDTO("halebidu", "halebiduTemple", 150, "Fogg", "Chikkamaglur Beach");
		PlaceDTO dto1 = new PlaceDTO("Nanjanagugu", "srikanteshwara", 280, "very Cold", "Historical Place");
		PlaceDTO dto2 = new PlaceDTO("Shivamogga", "Falls", 260, "Normal Cold", "Fallsa nature");
		PlaceDTO dto3 = new PlaceDTO("Hampi", "Hampi TEmple", 160, "warm", "Temple Place");
		PlaceDTO dto4 = new PlaceDTO("Badami", "Badamia temple", 600, "Normal Warm", "Temple Place");
		PlaceRepsitory placeRepository = new PlaceRepositoryImpl();
		PlaceService placeService = new PlaceServiceImpl(placeRepository);
		try {
			boolean value1 = placeService.validateAndSave(dto);
			System.out.println(value1);
			boolean value2 = placeService.validateAndSave(dto1);
			System.out.println(value2);
			boolean value3 = placeService.validateAndSave(dto2);
			System.out.println(value3);
			boolean value4 = placeService.validateAndSave(dto3);
			System.out.println(value4);
			boolean value5 = placeService.validateAndSave(dto4);
			System.out.println(value5);

		} catch (StorageInvalidExeception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
