package com.xworkz.datatransfer.repository;

import com.xworkz.datatransfer.dto.MetroStaffDTO;

public class MetroStaffImpl implements MetroStaffRepository {

	private MetroStaffDTO[] metroStaffDTO = new MetroStaffDTO[TOTAL];
	private int index = 0;

	@Override
	public void save(MetroStaffDTO metroStaffDTO) {
		if (index < TOTAL) {
			this.metroStaffDTO[index] = metroStaffDTO;
			System.out.println("data saved at " + index + " " + metroStaffDTO.toString());
			index++;
		} else {
			System.err.println("cannot save more data, exceeding capacity");
		}

	}

}
