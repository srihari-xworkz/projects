package com.xworkz.datavalidation.runner;

import com.xworkz.datavalidation.dto.MechanicDTO;
import com.xworkz.datavalidation.service.MechanicServiceImpl;

public class MechanicRunner {

	public static void main(String[] args) {

		System.out.println("running main in Mechanic Runner");

		MechanicDTO mechanicDTO = new MechanicDTO("Janata Garage", 2648784, 1200, "oil and service");
		System.out.println(mechanicDTO);
		System.out.println();

		MechanicServiceImpl mechanicService = new MechanicServiceImpl();
		System.out.println(mechanicService.saveAndValidate(mechanicDTO));

	}

}
