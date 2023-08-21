package com.xworz.crudandvalidate.repository;

import com.xworz.crudandvalidate.dto.MoviesDTO;

public interface MoviesRepo {
	
	int TOTAL = 5;

	public void save(MoviesDTO moviesDTO);
}
