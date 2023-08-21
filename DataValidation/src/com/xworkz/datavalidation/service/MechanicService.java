package com.xworkz.datavalidation.service;

import com.xworkz.datavalidation.dto.MechanicDTO;

public interface MechanicService {

	boolean saveAndValidate(MechanicDTO mechanicDTO);
}
