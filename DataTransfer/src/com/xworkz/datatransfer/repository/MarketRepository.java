package com.xworkz.datatransfer.repository;

import com.xworkz.datatransfer.dto.MarketDTO;

public interface MarketRepository {

	int TOTAL = 5;

	public void save(MarketDTO marketDTO);

	public MarketDTO findByArea(String area);

	public MarketDTO findByType(String type);

	public MarketDTO[] readAll();

}
