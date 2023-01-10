package com.xworkz.validation.boot;

import com.xworkz.validation.Repository.HelmetRepository;
import com.xworkz.validation.Repository.HelmetRepositoryImplimentation;
import com.xworkz.validation.constant.Color;
import com.xworkz.validation.constant.Type;
import com.xworkz.validation.dto.HelmetDTO;
import com.xworkz.validation.service.HelmetService;
import com.xworkz.validation.service.HelmetServiceImplimentation;

public class HelmetRunner {

			public static void main(String[] args) {

				HelmetDTO dto=new HelmetDTO("Hero", 500D, Color.BLACK, Type.HALF);
				//dto.setColour(Color.BLUE);
				HelmetRepository repo = new HelmetRepositoryImplimentation() {
					
					@Override
					public boolean save(HelmetDTO dto) {
						System.out.println("valid out put");
						return false;
					}
				};
				HelmetService service = new HelmetServiceImplimentation(repo);
				boolean sucess = service.saveAndVlidate(dto);
				System.out.println("sucess " + sucess);
			}

		

	}


