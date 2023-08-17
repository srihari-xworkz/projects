package com.xworkz.datatransfer.Runner;

import com.xworkz.datatransfer.dto.PilotDTO;
import com.xworkz.datatransfer.repository.PilotRepository;
import com.xworkz.datatransfer.repository.PilotRepositoryImpl;

public class PilotRunner {

	public static void main(String[] args) {

		System.out.println("main method of PilotRunner");

		PilotDTO pilotDTO1 = new PilotDTO("shree", true, 23, "commander", 150000);
		System.out.println(pilotDTO1.toString());
		PilotDTO pilotDTO2 = new PilotDTO("akshay", true, 25, "copilot", 100000);
		System.out.println(pilotDTO2.toString());
		PilotDTO pilotDTO3 = new PilotDTO("joseph", false, 22, "assist", 80000);
		System.out.println(pilotDTO3.toString());
		PilotDTO pilotDTO4 = new PilotDTO("anubhav", true, 26, "marshal", 200000);
		System.out.println(pilotDTO4.toString());
		PilotDTO pilotDTO5 = new PilotDTO("shyanm", true, 24, "wingcommander", 250000);
		System.out.println(pilotDTO5.toString());
		System.out.println();

		PilotRepository pilotRepository = new PilotRepositoryImpl();
		pilotRepository.save(pilotDTO1);
		pilotRepository.save(pilotDTO2);
		pilotRepository.save(pilotDTO3);
		pilotRepository.save(pilotDTO4);
		pilotRepository.save(pilotDTO5);

	}

}
