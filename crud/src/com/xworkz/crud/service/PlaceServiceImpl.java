package com.xworkz.crud.service;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.dto.PlaceDTO;
import com.xworkz.crud.exception.StorageInvalidExeception;
import com.xworkz.crud.repository.PlaceRepsitory;

public class PlaceServiceImpl implements PlaceService {
	private PlaceRepsitory place;

	public PlaceServiceImpl(PlaceRepsitory place) {
		super();
		this.place = place;
	}
	
	public boolean validateAndSave(PlaceDTO placeDTO) throws StorageInvalidExeception {
    
     String FavPlace= placeDTO.getFavPlace();
     String nameOfPlace= placeDTO.getNameOfPlace();
     int famousFor= placeDTO.getFamousFor();
     String Climate= placeDTO.getClimate();
     String BeachName= placeDTO.getBeachName();
  
     boolean FavPlacevalid= false;
     boolean nameOfPlaceValid = false;
     boolean famousForValid = false;
     boolean ClimateValid = false;
     boolean BeachNameValid = false;
     if (FavPlace != null && FavPlace.length() >= 4 && FavPlace.length() < 20) {
			System.out.println("favPlace is Valid Continue");
		FavPlacevalid = true;

		} else {
			System.out.println("Invalid favPlace You will get extception");
		}

		if (nameOfPlace != null && nameOfPlace.length() >= 4 && nameOfPlace.length() < 20) {
			System.out.println("nameOfPlace is valid continue ");
			nameOfPlaceValid = true;
		} else {
			System.out.println("nameOfPlace is invalid");
		}
		if (famousFor>3 && famousFor<=200) {
			System.out.println("famousFor is valid continue ");
			famousForValid = true;
		} else {
			System.out.println("famousFor is invalid");
		}
		
		if (BeachNameValid && famousForValid && nameOfPlaceValid && ClimateValid) {
			System.out.println("data sucessfull in given  progress");
			boolean value = place.store(placeDTO);
			System.out.println("storing data:" + value);
			return value;
		}
		throw new StorageInvalidExeception("Invalid Data Doesnot Store Data");

	}


	@Override
	public boolean validateAndSave1(PlaceDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}
}
   
     

	

