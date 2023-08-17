package com.xworkz.datatransfer.repository;

import com.xworkz.datatransfer.dto.PilotDTO;

public interface PilotRepository {

	int TOTAL = 5;

	public void save(PilotDTO pilotDTO);

}
