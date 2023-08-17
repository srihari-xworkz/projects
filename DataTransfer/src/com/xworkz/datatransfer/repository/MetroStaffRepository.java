package com.xworkz.datatransfer.repository;

import com.xworkz.datatransfer.dto.MetroStaffDTO;

public interface MetroStaffRepository {

	int TOTAL = 5;

	public void save(MetroStaffDTO metroStaffDTO);

	public MetroStaffDTO findByEmpName(String emp);

	public MetroStaffDTO findBySalary(int amount);

	public MetroStaffDTO findByBranch(String branch);

	public MetroStaffDTO[] readAll();

}
