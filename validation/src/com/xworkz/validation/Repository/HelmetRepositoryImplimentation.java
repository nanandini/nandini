package com.xworkz.validation.Repository;

import com.xworkz.validation.dto.HelmetDTO;

public abstract class HelmetRepositoryImplimentation implements HelmetRepository{
	
	private HelmetDTO[] dtos=new HelmetDTO[10];
	private int currentIndex;
	
		@Override
		public boolean save1(HelmetDTO dto) {
			System.out.println("running save");
			if(this.currentIndex>dtos.length) {
				System.out.println("storage full");
				return false;
			}
			this.dtos[this.currentIndex]=dto;
			System.out.println("saved "+dto +" in the index "+currentIndex);
			currentIndex++;
			return true;
		}
		
		
		}

	


