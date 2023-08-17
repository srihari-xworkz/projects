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

	@Override
	public PilotDTO findByAge(int age) {
		for (int i = 0; i < index; i++) {
			if (pilotDTO[i].getAge() == age) {
				System.out.println("age match found...");
				return pilotDTO[i];
			} else {
				System.err.println("given age is not found, checking further.....");
			}
		}
		return null;
	}

	@Override
	public PilotDTO findByRank(String rank) {
		for (int i = 0; i < index; i++) {
			if (pilotDTO[i].getRank() == rank) {
				System.out.println("rank match found...");
				return pilotDTO[i];
			} else {
				System.err.println("given rank is not found, checking further.....");
			}
		}
		return null;
	}

	@Override
	public PilotDTO findByName(String names) {
		for (int i = 0; i < index; i++) {
			if (pilotDTO[i].getName() == names) {
				System.out.println("name match found...");
				return pilotDTO[i];
			} else {
				System.err.println("given name is not found, checking further.....");
			}
		}
		return null;
	}

	@Override
	public PilotDTO[] readAll() {

		return pilotDTO;
	}

}
