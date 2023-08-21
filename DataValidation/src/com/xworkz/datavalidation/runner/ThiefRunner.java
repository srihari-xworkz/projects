package com.xworkz.datavalidation.runner;

import com.xworkz.datavalidation.dto.ThiefDTO;
import com.xworkz.datavalidation.service.ThiefService;
import com.xworkz.datavalidation.service.ThiefServiceImpl;

public class ThiefRunner {

	public static void main(String[] args) {
		System.out.println("Validate and save operation of Thief");
		ThiefDTO thiefDTO = new ThiefDTO("LockerBreak", 4, 28, "TaklaGang", 1);

		System.out.println();

		ThiefService thiefService = new ThiefServiceImpl();
		thiefService.validateAndSave(thiefDTO);

	}

}
