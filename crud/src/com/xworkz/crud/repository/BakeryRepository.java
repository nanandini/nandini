package com.xworkz.crud.repository;

import com.xworkz.crud.dto.BakeryDTO;
import com.xworkz.crud.exception.SizeExceedException;

public interface BakeryRepository {
	boolean store(BakeryDTO dto) throws SizeExceedException;
}
