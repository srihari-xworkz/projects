package com.xworkz.datatransfer.Runner;

import com.xworkz.datatransfer.dto.MetroStaffDTO;
import com.xworkz.datatransfer.repository.MetroStaffImpl;
import com.xworkz.datatransfer.repository.MetroStaffRepository;

public class MetroStaffRunner {

	public static void main(String[] args) {

		System.out.println("invoking main of MetroStaffRunner");
		MetroStaffDTO metroStaffDTO1 = new MetroStaffDTO("ajith", 35000, "banashankari", 8, 20);
		MetroStaffDTO metroStaffDTO2 = new MetroStaffDTO("ashok", 30000, "majestic", 6, 15);
		MetroStaffDTO metroStaffDTO3 = new MetroStaffDTO("satish", 25000, "yeswantpur", 10, 18);
		MetroStaffDTO metroStaffDTO4 = new MetroStaffDTO("kartik", 22000, "mahalakshmi", 8, 20);
		MetroStaffDTO metroStaffDTO5 = new MetroStaffDTO("santosh", 40000, "chickpete", 7, 16);

		System.out.println();

		MetroStaffRepository metroStaffRepository = new MetroStaffImpl();
		metroStaffRepository.save(metroStaffDTO1);
		metroStaffRepository.save(metroStaffDTO2);
		metroStaffRepository.save(metroStaffDTO3);
		metroStaffRepository.save(metroStaffDTO4);
		metroStaffRepository.save(metroStaffDTO5);

	}

}
