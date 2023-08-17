package com.xworkz.datatransfer.repository;

import com.xworkz.datatransfer.dto.MarketDTO;
import com.xworkz.datatransfer.dto.TheatreDTO;

public interface TheatreRepository {

	int TOTAL = 5;

	public void save(TheatreDTO theatreDTO);

	public TheatreDTO findByCapacity(int capacity);

	public TheatreDTO findByRating(int rates);

	public TheatreDTO findByName(String name);

	public TheatreDTO[] readAll();

}
