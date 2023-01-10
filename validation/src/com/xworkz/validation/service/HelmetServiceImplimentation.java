package com.xworkz.validation.service;

import java.io.Serializable;

import com.xworkz.validation.Repository.HelmetRepository;
import com.xworkz.validation.constant.Color;
import com.xworkz.validation.constant.Type;
import com.xworkz.validation.dto.HelmetDTO;

public class HelmetServiceImplimentation implements HelmetService {

	private HelmetRepository repo;

	public HelmetServiceImplimentation(HelmetRepository repo) {
		super();
		this.repo = repo;
	}

	public boolean saveAndVlidate1(HelmetDTO dto) {
		String brand = dto.getBrand();
		Color colour = dto.getColour();
		Serializable type = dto.getType();
		Double price = dto.getPrice();
		boolean validBrand = false;
		boolean validType = false;
		boolean validColour = false;
		boolean validPrice = false;
		if (brand != null && brand.length() >= 4 && brand.length() <= 15) {
			System.out.println("brand is valid " + brand);
			validBrand = true;

			// System.out.println("brand is created");
		} else {
			System.out.println("brand is invalid " + brand);

		}
		if (type != null) {
			System.out.println("type is valid " + type);
			validType = true;
		} else {
			System.out.println("type is invalid " + type);
		}
		if (colour != null) {
			System.out.println("colour is valid " + colour);
			validColour = true;
		} else {
			System.out.println("colour is invalid ");
		}
		if (price != null && price > 50 && price < 1000) {
			System.out.println("price is valid " + price);

			validPrice = true;
		} else {
			System.out.println("price is invalid " + price);
		}

		if (validBrand && validType && validPrice && validColour) {
			boolean save = repo.save(dto);
			System.out.println("Helmet DTO is valid and can be saved using helmentRepository" + save);

			return true;
		} else {
			System.out.println("Helmet DTO is invalid and cannot be saved");
			return false;
		}
	}

	@Override
	public boolean saveAndVlidate(HelmetDTO dto) {
		System.out.println("checking valid or not");
		return true;
	}

}
