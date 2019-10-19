package com.hexaware.HexaCinemas.controller;

import org.springframework.data.repository.CrudRepository;

import com.hexaware.HexaCinemas.model.MovieDetails;

public interface MovieInterface extends CrudRepository<MovieDetails, Integer> {
	
}
