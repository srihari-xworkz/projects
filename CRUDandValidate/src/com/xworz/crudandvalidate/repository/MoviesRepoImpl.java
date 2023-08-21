package com.xworz.crudandvalidate.repository;

import com.xworz.crudandvalidate.dto.HospitalDTO;
import com.xworz.crudandvalidate.dto.MoviesDTO;

public class MoviesRepoImpl implements MoviesRepo {

	private MoviesDTO[] moviesDTO = new MoviesDTO[TOTAL];
	private int index = 0;

	@Override
	public void save(MoviesDTO moviesDTO) {
		if (index < TOTAL) {
			this.moviesDTO[index] = moviesDTO;
			System.out.println("data saved at " + index + " " + moviesDTO.toString());
			index++;
		} else {
			System.err.println("cannot save more data.....");
		}
	}
}
