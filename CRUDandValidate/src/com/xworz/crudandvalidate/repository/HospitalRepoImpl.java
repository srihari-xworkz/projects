package com.xworz.crudandvalidate.repository;

import com.xworz.crudandvalidate.dto.HospitalDTO;

public class HospitalRepoImpl implements HospitalRepo {

	private HospitalDTO[] hospitalDTO = new HospitalDTO[TOTAL];
	private int index = 0;

	@Override
	public void save(HospitalDTO hospitalDTO) {
		if (index < TOTAL) {
			this.hospitalDTO[index] = hospitalDTO;
			System.out.println("data saved at " + index + " " + hospitalDTO.toString());
			index++;
		} else {
			System.err.println("cannot save more data.....");
		}
	}

}
