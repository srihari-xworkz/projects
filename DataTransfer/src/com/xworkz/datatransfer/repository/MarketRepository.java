package com.xworkz.datatransfer.repository;

import com.xworkz.datatransfer.dto.MarketDTO;

public interface MarketRepository {

	int TOTAL = 5;

	public void save(MarketDTO marketDTO);

}
