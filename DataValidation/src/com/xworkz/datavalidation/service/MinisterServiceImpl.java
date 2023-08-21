package com.xworkz.datavalidation.service;

import com.xworkz.datavalidation.dto.MinisterDTO;

public class MinisterServiceImpl implements MinisterService {

	@Override
	public boolean validateandsave(MinisterDTO ministerDTO) {
		if (ministerDTO != null) {
			System.out.println("DTO is not null, can validate data");
			if (ministerDTO.getName() != null && !ministerDTO.getName().isEmpty() && ministerDTO.getName().length() > 3
					&& ministerDTO.getName().length() < 20) {
				System.out.println("Minister Name is vallid , can save name");
			} else {
				System.err.println("Minister name is invalid cannot save");
				return false;
			}
			if (ministerDTO.getDesignation() != null && !ministerDTO.getDesignation().isEmpty()
					&& ministerDTO.getDesignation().length() > 3 && ministerDTO.getDesignation().length() < 20) {
				System.out.println("entered Designation is valid can save company name");
			} else {
				System.err.println("Designation is invalid");
				return false;
			}
			if (ministerDTO.getPartyName() != null && !ministerDTO.getPartyName().isEmpty()
					&& ministerDTO.getPartyName().length() > 3 && ministerDTO.getPartyName().length() < 20) {
				System.out.println("Party Name is valid");
			} else {
				System.err.println("Party Name is invalid cannot save");
				return false;
			}
			if (ministerDTO.getExp() > 0 && ministerDTO.getExp() < 150) {
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