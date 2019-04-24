package com.bjanczak.CinemaAppJavaAngular.controller;

import com.bjanczak.CinemaAppJavaAngular.dto.MovieDto;
import com.bjanczak.CinemaAppJavaAngular.model.Movie;
import com.bjanczak.CinemaAppJavaAngular.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<MovieDto> getMovies() {
        return movieService.getMovies();
    }

    @RequestMapping(value = "/movie", method = RequestMethod.POST)
    public Movie newMovie() {
        return null;
    }
}
