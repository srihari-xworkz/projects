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

}
