package com.xworkz.datavalidation.service;

import com.xworkz.datavalidation.dto.ThiefDTO;

public interface ThiefService {

	public boolean validateAndSave(ThiefDTO thiefDTO);
}
