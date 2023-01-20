package com.xworkz.lombok.repository;

import com.xworkz.lombok.DTO.MissileDTO;

public interface MissileRepository {
	static boolean value(MissileDTO dto) {
		System.out.println("Strating dto ...");
		return false;
		
	}

}
