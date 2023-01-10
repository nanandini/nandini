package com.xworkz.crud.service;

import com.xworkz.crud.dto.PlaceDTO;
import com.xworkz.crud.exception.StorageInvalidExeception;

public interface PlaceService {
	boolean validateAndSave(PlaceDTO placeDTO) throws StorageInvalidExeception;

	boolean validateAndSave1(PlaceDTO dto);

}
