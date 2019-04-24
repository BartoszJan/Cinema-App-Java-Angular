package com.bjanczak.CinemaAppJavaAngular.repository.custom;

import com.bjanczak.CinemaAppJavaAngular.dto.MovieDto;

import java.util.List;

public interface MovieRepositoryCustom {

    /**
     * @return method return list of all movies
     */
    List<MovieDto> getMoviesList();
}
