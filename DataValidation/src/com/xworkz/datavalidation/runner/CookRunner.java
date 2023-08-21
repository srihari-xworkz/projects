package com.xworkz.datavalidation.runner;

import com.xworkz.datavalidation.dto.CookDTO;
import com.xworkz.datavalidation.service.CookService;
import com.xworkz.datavalidation.service.CookServiceImpl;

public class CookRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main method of Cook");

		CookDTO cookDTO = new CookDTO("RaagiMudde", "Hotel Mandya", "Male", 35000);

		CookService cookService = new CookServiceImpl();
		System.out.println(cookService.validateAndSave(cookDTO));

	}

}
