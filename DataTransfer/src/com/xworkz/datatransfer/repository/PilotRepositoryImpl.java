package com.xworkz.datatransfer.repository;

import com.xworkz.datatransfer.dto.PilotDTO;

public class PilotRepositoryImpl implements PilotRepository {

	private PilotDTO[] pilotDTO = new PilotDTO[TOTAL];
	private int index = 0;

	@Override
	public void save(PilotDTO pilotDTO) {
		if (index < TOTAL) {
			this.pilotDTO[index] = pilotDTO;
			System.out.println("data saved at " + index + " " + pilotDTO.toString());
			index++;
		} else {
			System.err.println("cannot save more data...");
		}
	}

}
