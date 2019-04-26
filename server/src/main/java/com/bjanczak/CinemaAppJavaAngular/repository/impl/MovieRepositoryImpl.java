package com.bjanczak.CinemaAppJavaAngular.repository.impl;

import com.bjanczak.CinemaAppJavaAngular.dto.MovieDto;
import com.bjanczak.CinemaAppJavaAngular.dto.QMovieDto;
import com.bjanczak.CinemaAppJavaAngular.model.QMovie;
import com.bjanczak.CinemaAppJavaAngular.repository.custom.MovieRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<MovieDto> getMoviesList() {
        QMovie qMovie = QMovie.movie;

        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        QMovieDto header = new QMovieDto(qMovie.id, qMovie.title, qMovie.year, qMovie.duration,
                qMovie.description, qMovie.director, qMovie.imageSource);

        return queryFactory.select(header)
                .from(qMovie)
                .fetch();
    }
}