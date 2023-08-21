package com.xworz.crudandvalidate.runner;

import com.xworz.crudandvalidate.dto.HospitalDTO;
import com.xworz.crudandvalidate.service.HospitalService;
import com.xworz.crudandvalidate.service.HospitalServiceImpl;

public class HospitalRunner {

	public static void main(String[] args) {

		System.out.println("invoking main method of Hospital");
		HospitalDTO hospitalDTO = new HospitalDTO("Jayadeva", "multiSpeciality", "BTM", 20);
		System.out.println(hospitalDTO);

		System.out.println();

		HospitalService hospitalService = new HospitalServiceImpl();
		System.out.println(hospitalService.validateAndSave(hospitalDTO));

	}

}
