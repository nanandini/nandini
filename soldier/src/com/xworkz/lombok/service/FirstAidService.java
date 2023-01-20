package com.xworkz.lombok.service;

import com.xworkz.lombok.DTO.FirstAidDTO;

public interface FirstAidService {
	boolean validateAndSave(FirstAidDTO dto);
}
