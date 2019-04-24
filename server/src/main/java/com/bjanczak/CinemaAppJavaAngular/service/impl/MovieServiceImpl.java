package com.bjanczak.CinemaAppJavaAngular.service.impl;

import com.bjanczak.CinemaAppJavaAngular.dto.MovieDto;
import com.bjanczak.CinemaAppJavaAngular.model.Movie;
import com.bjanczak.CinemaAppJavaAngular.repository.MovieRepository;
import com.bjanczak.CinemaAppJavaAngular.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieDto> getMovies() {
        return movieRepository.getMoviesList();
    }
}