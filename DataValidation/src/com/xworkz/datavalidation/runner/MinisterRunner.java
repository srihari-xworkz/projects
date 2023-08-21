package com.xworkz.datavalidation.runner;

import com.xworkz.datavalidation.dto.MinisterDTO;
import com.xworkz.datavalidation.service.MinisterService;
import com.xworkz.datavalidation.service.MinisterServiceImpl;

public class MinisterRunner {

	public static void main(String[] args) {

		System.out.println("main method of Minister");
		MinisterDTO ministerDTO = new MinisterDTO("siddu", 0, "karnatakaCM", "congress");
		System.out.println(ministerDTO);
		System.out.println();

		MinisterService ministerService = new MinisterServiceImpl();
		System.out.println(ministerService.validateandsave(ministerDTO));

	}

}
