package com.xworz.crudandvalidate.service;

import com.xworz.crudandvalidate.dto.MoviesDTO;
import com.xworz.crudandvalidate.repository.MoviesRepo;
import com.xworz.crudandvalidate.repository.MoviesRepoImpl;
import com.xworz.crudandvalidate.util.ValidationUtil;

public class MovieServiceImpl implements MovieService {

	@Override
	public boolean validateAndSave(MoviesDTO moviesDTO) {
		if (moviesDTO != null) {
			System.out.println("DTO is not null, can validate and save data");

			String name = moviesDTO.getMovieName();
			String actor = moviesDTO.getActor();
			String actress = moviesDTO.getActress();
			int year = moviesDTO.getYear();

			if (ValidationUtil.stringValidation(name)) {
				System.out.println(name + " is valid, can save");
			} else {
				System.err.println(name + " is invalid cannot save");
				return false;
			}
			if (ValidationUtil.stringValidation(actor)) {
				System.out.println(actor + " is valid, can save");
			} else {
				System.err.println(actor + " is invalid cannot save");
				return false;
			}
			if (ValidationUtil.stringValidation(actress)) {
				System.out.println(actress + " is valid, can save");
			} else {
				System.err.println(actress + " is invalid cannot save");
				return false;
			}
			if (year != 0 && year > 2000 && year <= 2023) {
				System.out.println(actress + " is valid, can save");
			} else {
				System.err.println(year + " is invalid cannot save");
				return false;
			}

			MoviesRepo moviesRepo = new MoviesRepoImpl();
			moviesRepo.save(moviesDTO);
			return true;

		} else {
			System.err.println("DTO is null, cannot validate and save");
		}
		return false;
	}

}
