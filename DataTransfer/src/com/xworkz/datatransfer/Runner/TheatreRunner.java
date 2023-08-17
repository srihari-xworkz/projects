package com.xworkz.datatransfer.Runner;

import com.xworkz.datatransfer.dto.TheatreDTO;
import com.xworkz.datatransfer.repository.TheatreRepository;
import com.xworkz.datatransfer.repository.TheatreRepositoryImpl;

public class TheatreRunner {

	public static void main(String[] args) {

		System.out.println("invoking main of Theatre");

		TheatreDTO theatreDTO1 = new TheatreDTO("Shanti", 200, 400, 4, true);
		System.out.println(theatreDTO1.toString());
		TheatreDTO theatreDTO2 = new TheatreDTO("amar", 150, 200, 3, false);
		System.out.println(theatreDTO2.toString());
		TheatreDTO theatreDTO3 = new TheatreDTO("inox", 100, 800, 5, true);
		System.out.println(theatreDTO3.toString());
		TheatreDTO theatreDTO4 = new TheatreDTO("pvr", 150, 1200, 5, true);
		System.out.println(theatreDTO4.toString());
		TheatreDTO theatreDTO5 = new TheatreDTO("gopalan", 250, 500, 4, false);
		System.out.println(theatreDTO5.toString());

		System.out.println();

		TheatreRepository theatreRepository = new TheatreRepositoryImpl();
		theatreRepository.save(theatreDTO1);
		theatreRepository.save(theatreDTO2);
		theatreRepository.save(theatreDTO3);
		theatreRepository.save(theatreDTO4);
		theatreRepository.save(theatreDTO5);

	}

}
