package com.bjanczak.CinemaAppJavaAngular.repository;

import com.bjanczak.CinemaAppJavaAngular.model.Movie;
import com.bjanczak.CinemaAppJavaAngular.repository.custom.MovieRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long>, MovieRepositoryCustom{
}
