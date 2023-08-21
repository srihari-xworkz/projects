package com.xworz.crudandvalidate.service;

import com.xworz.crudandvalidate.dto.HospitalDTO;

public interface HospitalService {

	boolean validateAndSave(HospitalDTO hospitalDTO);
}
