package com.xworkz.datavalidation.service;

import com.xworkz.datavalidation.dto.ThiefDTO;

public class ThiefServiceImpl implements ThiefService {

	@Override
	public boolean validateAndSave(ThiefDTO thiefDTO) {
		if (thiefDTO != null) {
			System.out.println("DTO is not null, can validate data");
			if (thiefDTO.getSpecializedIn() != null && !thiefDTO.getSpecializedIn().isEmpty()
					&& thiefDTO.getSpecializedIn().length() > 3 && thiefDTO.getSpecializedIn().length() < 20) {
				System.out.println("SpecializedIn is vallid , can save name");
			} else {
				System.err.println("SpecializedIn is invalid cannot save");
				return false;
			}
			if (thiefDTO.getGangName() != null && !thiefDTO.getGangName().isEmpty()
					&& thiefDTO.getGangName().length() > 3 && thiefDTO.getGangName().length() < 20) {
				System.out.println("entered Gang Name is valid can save Gang name");
			} else {
				System.err.println("Gang Name is invalid");
				return false;
			}
			if (thiefDTO.getAge() > 0 && thiefDTO.getAge() < 150) {
				System.out.println("Age is valid can save");
			} else {
				System.err.println("invalid Age");
				return false;
			}
			if (thiefDTO.getExperience() > 0 && thiefDTO.getExperience() < 150) {
				System.out.println("Experience is valid can save");
			} else {
				System.err.println("invalid Experience");
				return false;
			}
			if (thiefDTO.getTotalCases() > 0 && thiefDTO.getTotalCases() < 100) {
				System.out.println("Total Cases is valid can save");
			} else {
				System.err.println("invalid Total Cases");
				return false;
			}
			return true;

		} else {
			System.err.println("DTO is null, cannot validate data");
		}
		return false;
	}

}
