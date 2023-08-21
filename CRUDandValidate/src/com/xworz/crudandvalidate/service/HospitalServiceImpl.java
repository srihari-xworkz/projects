package com.xworz.crudandvalidate.service;

import com.xworz.crudandvalidate.dto.HospitalDTO;
import com.xworz.crudandvalidate.repository.HospitalRepo;
import com.xworz.crudandvalidate.repository.HospitalRepoImpl;
import com.xworz.crudandvalidate.util.ValidationUtil;

public class HospitalServiceImpl implements HospitalService {

	@Override
	public boolean validateAndSave(HospitalDTO hospitalDTO) {
		if (hospitalDTO != null) {
			System.out.println("DTO is not null, can validate and save data");

			String name = hospitalDTO.getName();
			String location = hospitalDTO.getLocation();
			String special = hospitalDTO.getSpeciality();
			int surgeon = hospitalDTO.getNoOfSurgeons();

			if (ValidationUtil.stringValidation(name)) {
				System.out.println(name + " is valid, can save");
			} else {
				System.err.println(name + " is invalid cannot save");
				return false;
			}
			if (ValidationUtil.stringValidation(location)) {
				System.out.println(location + " is valid, can save");
			} else {
				System.err.println(location + " is invalid cannot save");
				return false;
			}
			if (ValidationUtil.stringValidation(special)) {
				System.out.println(special + " is valid, can save");
			} else {
				System.err.println(special + " is invalid cannot save");
				return false;
			}
			if (surgeon != 0 && surgeon > 0 && surgeon <= 20) {
				System.out.println(surgeon + " is valid, can save");
			} else {
				System.err.println(surgeon + " is invalid cannot save");
				return false;
			}

			HospitalRepo hospitalRepo = new HospitalRepoImpl();
			hospitalRepo.save(hospitalDTO);
			return true;

		} else {
			System.err.println("DTO is null, cannot validate and save");
		}
		return false;
	}

}
