package com.xworkz.crud.service;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.exception.StorageInvalidExeception;

public interface BekaryService { 
	
	boolean validateAndSave(BakeryDTO bakeryDTO) throws StorageInvalidExeception;

	boolean validateAndSave1(BakeryDTO dto);

}
