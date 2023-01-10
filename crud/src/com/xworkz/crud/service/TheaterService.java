package com.xworkz.crud.service;

import com.xworkz.crud.dto.TheaterDTO;
import com.xworkz.crud.exception.StorageInvalidExeception;

public interface TheaterService {

	boolean validDateAndSave(TheaterDTO theaterDTO) throws StorageInvalidExeception;

	boolean validateAndSaveData(TheaterDTO dto);

}
