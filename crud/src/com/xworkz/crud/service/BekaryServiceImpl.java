package com.xworkz.crud.service;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.exception.StorageInvalidExeception;
import com.xworkz.crud.repository.BakeryRepository;

public class BekaryServiceImpl implements BekaryService {

	private BakeryRepository bekary;

	public BekaryServiceImpl(BakeryRepository bekary) {
		super();
		this.bekary = bekary;
	}

	@Override
	public boolean validateAndSave(BakeryDTO bakeryDTO) throws StorageInvalidExeception {

		String name = bakeryDTO.getName();
		String location = bakeryDTO.getLocation();
		String owner = bakeryDTO.getOwnerName();
		long phone = bakeryDTO.getPhNo();

		boolean namevalid = false;
		boolean locationvalid = false;
		boolean ownervalid = false;
		boolean phoneNovalid = false;

		if (name != null && name.length() >= 4 && name.length() < 20) {
			System.out.println("Name is Valid Continue");
			namevalid = true;

		} else {
			System.out.println("Invalid name You will get extception");
		}

		if (location != null && location.length() >= 4 && location.length() < 20) {
			System.out.println("location is valid continue ");
			locationvalid = true;
		} else {
			System.out.println("location is invalid");
		}
		if (owner != null && owner.length() >= 4 && owner.length() < 20) {
			System.out.println("OwnerName is valid continue ");
			ownervalid = true;
		} else {
			System.out.println("OwnerName is invalid");
		}
		if (phone > 6) {
			System.out.println("contactNo is valid continue ");
			phoneNovalid = true;
		} else {
			System.out.println("phoneNo is invalid");
		}

		if (locationvalid && ownervalid && locationvalid && phoneNovalid) {
			System.out.println("data sucessfull in given  progress");
			boolean value = bekary.store(bakeryDTO);
			System.out.println("storing data:" + value);
			return value;
		}
		throw new StorageInvalidExeception("Invalid Data Doesnot Store Data");

	}

	@Override
	public boolean validateAndSave1(BakeryDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}
}
