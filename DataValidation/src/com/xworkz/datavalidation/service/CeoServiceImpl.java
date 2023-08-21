package com.xworkz.datavalidation.service;

import com.xworkz.datavalidation.dto.CeoDTO;

public class CeoServiceImpl implements CeoService {

	@Override
	public boolean validateAndSave(CeoDTO ceoDTO) {
		if (ceoDTO != null) {
			System.out.println("DTO is not null, can validate data");
			if (ceoDTO.getName() != null && !ceoDTO.getName().isEmpty() && ceoDTO.getName().length() > 3
					&& ceoDTO.getName().length() < 20) {
				System.out.println("CEO Name is vallid , can save name");
			} else {
				System.err.println("CEO name is invalid cannot save");
				return false;
			}
			if (ceoDTO.getCompName() != null && !ceoDTO.getCompName().isEmpty() && ceoDTO.getCompName().length() > 3
					&& ceoDTO.getCompName().length() < 20) {
				System.out.println("entered Company Name is valid can save company name");
			} else {
				System.err.println("company name is invalid");
				return false;
			}
			if (ceoDTO.getSalary() > 0) {
				System.out.println("CEO salary is valid");
			} else {
				System.err.println("salary is invalid cannot save salary");
				return false;
			}
			if (ceoDTO.getExp() > 0 && ceoDTO.getExp() < 150) {
				System.out.println("Experience is valid can save");
			} else {
				System.err.println("invalid Experience");
				return false;
			}
			return true;

		} else {
			System.err.println("DTO is null, cannot validate data");
		}
		return false;
	}

}
