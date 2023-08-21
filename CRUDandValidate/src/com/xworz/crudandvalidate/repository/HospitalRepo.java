package com.xworz.crudandvalidate.repository;

import com.xworz.crudandvalidate.dto.HospitalDTO;

public interface HospitalRepo {

	int TOTAL = 5;

	public void save(HospitalDTO hospitalDTO);

}
