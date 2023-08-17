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

	@Override
	public MetroStaffDTO findByEmpName(String emp) {
		for (int i = 0; i < index; i++) {
			if (metroStaffDTO[i].getEmpName() == emp) {
				System.out.println("emp match found...");
				return metroStaffDTO[i];
			} else {
				System.err.println("given emp is not found, checking further.....");
			}
		}
		return null;
	}

	@Override
	public MetroStaffDTO findBySalary(int amount) {
		for (int i = 0; i < index; i++) {
			if (metroStaffDTO[i].getSalary() == amount) {
				System.out.println("amount match found...");
				return metroStaffDTO[i];
			} else {
				System.err.println("given amount is not found, checking further.....");
			}
		}
		return null;
	}

	@Override
	public MetroStaffDTO findByBranch(String branch) {
		for (int i = 0; i < index; i++) {
			if (metroStaffDTO[i].getBranch() == branch) {
				System.out.println("branch match found...");
				return metroStaffDTO[i];
			} else {
				System.err.println("given branch is not found, checking further.....");
			}
		}
		return null;
	}

	@Override
	public MetroStaffDTO[] readAll() {

		return metroStaffDTO;
	}

}
