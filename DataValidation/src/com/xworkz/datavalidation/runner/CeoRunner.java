package com.xworkz.datavalidation.runner;

import com.xworkz.datavalidation.dto.CeoDTO;
import com.xworkz.datavalidation.service.CeoService;
import com.xworkz.datavalidation.service.CeoServiceImpl;

public class CeoRunner {

	public static void main(String[] args) {

		CeoDTO ceoDTO = new CeoDTO("SundarPichai", "Google", 16000000, 0);
		System.out.println(ceoDTO);

		CeoService ceoService = new CeoServiceImpl();
		System.out.println(ceoService.validateAndSave(ceoDTO));

	}

}
