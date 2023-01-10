package com.xworkz.crud.repository;

import com.xworkz.crud.dto.PlaceDTO;
import com.xworkz.crud.exception.SizeExceedException;

public interface PlaceRepsitory {

	boolean store(PlaceDTO dto) throws SizeExceedException;
}
