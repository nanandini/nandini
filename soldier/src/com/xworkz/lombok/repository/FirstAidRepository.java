package com.xworkz.lombok.repository;

import com.xworkz.lombok.DTO.FirstAidDTO;
import com.xworkz.lombok.DTO.MissileDTO;

public interface FirstAidRepository {
	static boolean value(FirstAidDTO dto) {
		System.out.println("Strating dto ...");
		return false;

	}

}
