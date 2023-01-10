package com.xworkz.crud.repository;

import com.xworkz.crud.dto.TheaterDTO;
import com.xworkz.crud.exception.SizeExceedException;

public interface TheaterRepository {

	boolean store(TheaterDTO dto) throws SizeExceedException;

}
