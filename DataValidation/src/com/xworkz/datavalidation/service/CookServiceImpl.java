package com.xworkz.datavalidation.service;

import com.xworkz.datavalidation.dto.CookDTO;

public class CookServiceImpl implements CookService {

	@Override
	public boolean validateAndSave(CookDTO cookDTO) {
		if (cookDTO != null) {
			System.out.println("DTO is not null, can validate data");
			if (cookDTO.getSpecialItem() != null && !cookDTO.getSpecialItem().isEmpty()
					&& cookDTO.getSpecialItem().length() > 3 && cookDTO.getSpecialItem().length() < 20) {
				System.out.println("Special Item is vallid , can save item");
			} else {
				System.err.println("Special Item is invalid cannot save");
				return false;
			}
			if (cookDTO.getHotelName() != null && !cookDTO.getHotelName().isEmpty()
					&& cookDTO.getHotelName().length() > 3 && cookDTO.getHotelName().length() < 20) {
				System.out.println("entered Hotel is valid can save Hotel name");
			} else {
				System.err.println("Hotel is invalid");
				return false;
			}
			if (cookDTO.getGender() != null && !cookDTO.getGender().isEmpty() && cookDTO.getGender().length() > 3
					&& cookDTO.getGender().length() < 10) {
				System.out.println("Gender is valid");
			} else {
				System.err.println("Gender is invalid cannot save");
				return false;
			}
			if (cookDTO.getSalary() > 0 && cookDTO.getSalary() < 100000) {
				System.out.println("Salary is valid can save");
			} else {
				System.err.println("invalid salary");
				return false;
			}
			return true;

		} else {
			System.err.println("DTO is null, cannot validate data");
		}
		return false;
	}

}
