package com.xworkz.crud.service;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.dto.TheaterDTO;
import com.xworkz.crud.exception.StorageInvalidExeception;
import com.xworkz.crud.repository.TheaterRepository;

public class TheaterServiceImpl implements TheaterService {

	private TheaterRepository theater;

	public TheaterServiceImpl() {
		super();
		this.theater = theater;
	}

	public boolean validDateAndSave(TheaterDTO theaterDTO) throws StorageInvalidExeception {

		String name = theaterDTO.getName();
		String brand = theaterDTO.getBrand();
		int seats = theaterDTO.getSeats();
		int id = theaterDTO.getId();
		boolean nameValid = false;
		boolean brandValid = false;
		boolean idValid = false;
		boolean seatsValid = false;
		if (name != null && name.length() >= 3 && name.length() <= 25) {
			System.out.println("Name is valid  and Continue  process    :" + name);
			nameValid = true;
		} else {
			System.err.println("name is  in valid please Wait Exception is comming soon ");
		}
		if (brand != null && brand.length() >= 3 && brand.length() <= 25) {
			System.out.println("Brand is valid  and Continue  process    :" + name);
			brandValid = true;
		} else {
			System.err.println("Brand is  in valid please Wait Exception is comming soon ");
		}
		if (id >= 2) {
			System.out.println("Idis valid  and Continue  process    :" + name);
			idValid = true;
		} else {
			System.err.println("id is  in valid please Wait Exception is comming soon ");
		}

		if (seats > 3 && seats <= 700) {
			System.out.println("Seats is valid  and Continue  process    :" + name);
			seatsValid = true;
		} else {
			System.err.println("Seats is  in valid please Wait Exception is comming soon ");
		}

		if (seatsValid && nameValid && idValid && brandValid) {
			System.out.println("Your data is Validating Please Wait Saving in Progress  ");
			boolean value = theater.store(theaterDTO);

			System.out.println("Data is Saved Sucessfully  :" + value);
			return value;

		}
		throw new StorageInvalidExeception(
				"You are Entered data is in valid Please Valid Data it is get  DataValid Exception ");

	}

	@Override
	public boolean validateAndSaveData(TheaterDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

}