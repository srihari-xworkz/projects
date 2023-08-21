package com.xworkz.datavalidation.service;

import com.xworkz.datavalidation.dto.MechanicDTO;

public class MechanicServiceImpl implements MechanicService {

	@Override
	public boolean saveAndValidate(MechanicDTO mechanicDTO) {
		if (mechanicDTO != null) {
			System.out.println("DTO is not null, can validate data");
			if (mechanicDTO.getGarageName() != null && !mechanicDTO.getGarageName().isEmpty()
					&& mechanicDTO.getGarageName().length() > 3 && mechanicDTO.getGarageName().length() < 20) {
				System.out.println("Garage Name is vallid , can save name");
			} else {
				System.err.println("GarageName is invalid cannot save");
				return false;
			}
			if (mechanicDTO.getSpecialization() != null && !mechanicDTO.getSpecialization().isEmpty()
					&& mechanicDTO.getSpecialization().length() > 3 && mechanicDTO.getSpecialization().length() < 20) {
				System.out.println("entered specialization is valid can save specialization");
			} else {
				System.err.println("specialization is invalid");
				return false;
			}
			if (mechanicDTO.getGstNumber() > 0 && mechanicDTO.getGstNumber() < 10000000) {
				System.out.println("GST Number is valid");
			} else {
				System.err.println("GST Number is invalid cannot save");
				return false;
			}
			if (mechanicDTO.getBikeServiceCost() > 0 && mechanicDTO.getBikeServiceCost() < 2000) {
				System.out.println("bike Service Cost is valid can save");
			} else {
				System.err.println("bike Service Cost is invalid");
				return false;
			}
			return true;

		} else {
			System.err.println("DTO is null, cannot validate data");
		}
		return false;
	}

}
