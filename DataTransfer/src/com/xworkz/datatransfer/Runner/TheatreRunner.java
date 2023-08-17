package com.xworkz.datatransfer.Runner;

import com.xworkz.datatransfer.dto.TheatreDTO;
import com.xworkz.datatransfer.repository.TheatreRepository;
import com.xworkz.datatransfer.repository.TheatreRepositoryImpl;

public class TheatreRunner {

	public static void main(String[] args) {

		System.out.println("invoking main of Theatre");

		TheatreDTO theatreDTO1 = new TheatreDTO("Shanti", 200, 400, 4, true);
		TheatreDTO theatreDTO2 = new TheatreDTO("amar", 150, 200, 3, false);
		TheatreDTO theatreDTO3 = new TheatreDTO("inox", 100, 800, 5, true);
		TheatreDTO theatreDTO4 = new TheatreDTO("pvr", 150, 1200, 5, true);
		TheatreDTO theatreDTO5 = new TheatreDTO("gopalan", 250, 500, 4, false);

		System.out.println();

		TheatreRepository theatreRepository = new TheatreRepositoryImpl();
		theatreRepository.save(theatreDTO1);
		theatreRepository.save(theatreDTO2);
		theatreRepository.save(theatreDTO3);
		theatreRepository.save(theatreDTO4);
		theatreRepository.save(theatreDTO5);
		System.out.println();

		System.out.println(theatreRepository.findByCapacity(100));
		System.out.println();
		System.out.println(theatreRepository.findByName("amar"));
		System.out.println();
		System.out.println(theatreRepository.findByRating(4));
		System.out.println();

		TheatreDTO[] theatredto = theatreRepository.readAll();
		for (int i = 0; i < theatredto.length; i++) {
			if (theatredto != null) {
				System.out.println(theatredto[i]);
			}
		}

	}

}
