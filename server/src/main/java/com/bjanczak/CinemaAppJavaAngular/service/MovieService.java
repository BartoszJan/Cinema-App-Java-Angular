package com.bjanczak.CinemaAppJavaAngular.service;

import com.bjanczak.CinemaAppJavaAngular.dto.MovieDto;
import com.bjanczak.CinemaAppJavaAngular.model.Movie;

import java.util.List;

public interface MovieService {
    /**
     * Get all movies
     *
     * @return movie list
     */
    public List<MovieDto> getMovies();
}
