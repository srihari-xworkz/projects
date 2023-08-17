package com.xworkz.datatransfer.repository;

import com.xworkz.datatransfer.dto.MarketDTO;

public class MarketRepositoryImpl implements MarketRepository {

	private MarketDTO[] marketDTOs = new MarketDTO[TOTAL];
	private int index = 0;

	@Override
	public void save(MarketDTO marketDTOs) {
		if (index < TOTAL) {
			this.marketDTOs[index] = marketDTOs;
			System.out.println("data saved at " + index + " " + marketDTOs.toString());
			index++;
		} else {
			System.err.println("cannot save more data.....");
		}
	}

	@Override
	public MarketDTO findByArea(String area) {
		for (int i = 0; i < index; i++) {
			if (marketDTOs[i].getArea() == area) {
				System.out.println("area match found...");
				return marketDTOs[i];
			} else {
				System.err.println("given area is not found, checking further.....");
			}
		}
		return null;
	}

	@Override
	public MarketDTO findByType(String type) {
		for (int i = 0; i < index; i++) {
			if (marketDTOs[i].getType() == type) {
				System.out.println("type match found...");
				return marketDTOs[i];
			} else {
				System.err.println("given type is not found, checking further.....");
			}
		}
		return null;
	}

	@Override
	public MarketDTO[] readAll() {
		return marketDTOs;
	}

}
