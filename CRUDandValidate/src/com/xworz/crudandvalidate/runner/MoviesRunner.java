package com.xworz.crudandvalidate.runner;

import com.xworz.crudandvalidate.dto.MoviesDTO;
import com.xworz.crudandvalidate.service.MovieService;
import com.xworz.crudandvalidate.service.MovieServiceImpl;

public class MoviesRunner {

	public static void main(String[] args) {
		System.out.println("invoking main method of Movies");
		MoviesDTO moviesDTO = new MoviesDTO("shershah", "siddharth", "kiara", 2022);
		System.out.println(moviesDTO);

		System.out.println();

		MovieService movieService = new MovieServiceImpl();
		System.out.println(movieService.validateAndSave(moviesDTO));

	}

}
