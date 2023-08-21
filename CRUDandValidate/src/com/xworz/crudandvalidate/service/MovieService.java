package com.xworz.crudandvalidate.service;

import com.xworz.crudandvalidate.dto.MoviesDTO;

public interface MovieService {

	boolean validateAndSave(MoviesDTO moviesDTO);

}
