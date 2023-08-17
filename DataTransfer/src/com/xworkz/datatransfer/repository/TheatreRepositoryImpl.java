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

	@Override
	public TheatreDTO findByCapacity(int capacity) {
		for (int i = 0; i < index; i++) {
			if (theatreDTO[i].getCapacity() == capacity) {
				System.out.println("capacity match found...");
				return theatreDTO[i];
			} else {
				System.err.println("capacity is not found, checking further.....");
			}
		}
		return null;
	}

	@Override
	public TheatreDTO findByRating(int rates) {
		for (int i = 0; i < index; i++) {
			if (theatreDTO[i].getRating() == rates) {
				System.out.println("rate match found...");
				return theatreDTO[i];
			} else {
				System.err.println("rating is not found, checking further.....");
			}
		}
		return null;
	}

	@Override
	public TheatreDTO findByName(String name) {
		for (int i = 0; i < index; i++) {
			if (theatreDTO[i].getName() == name) {
				System.out.println("name match found...");
				return theatreDTO[i];
			} else {
				System.err.println("name is not found, checking further.....");
			}
		}
		return null;
	}

	@Override
	public TheatreDTO[] readAll() {

		return theatreDTO;
	}

}
