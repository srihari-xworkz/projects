package com.xworkz.datatransfer.repository;

import com.xworkz.datatransfer.dto.TheatreDTO;

public class TheatreRepositoryImpl implements TheatreRepository {

	private TheatreDTO[] theatreDTO = new TheatreDTO[TOTAL];
	private int index = 0;

	@Override
	public void save(TheatreDTO theatreDTO) {
		if (index < TOTAL) {
			this.theatreDTO[index] = theatreDTO;
			System.out.println("data saved at " + index + " " + theatreDTO.toString());
			index++;
		} else {
			System.err.println("cannot save more data");
		}

	}

}
