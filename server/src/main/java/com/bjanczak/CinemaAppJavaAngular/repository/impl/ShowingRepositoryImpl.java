package com.bjanczak.CinemaAppJavaAngular.repository.impl;

import com.bjanczak.CinemaAppJavaAngular.dto.QMovieDto;
import com.bjanczak.CinemaAppJavaAngular.dto.QShowingDto;
import com.bjanczak.CinemaAppJavaAngular.dto.ShowingDto;
import com.bjanczak.CinemaAppJavaAngular.model.QMovie;
import com.bjanczak.CinemaAppJavaAngular.model.QShowing;
import com.bjanczak.CinemaAppJavaAngular.repository.custom.ShowingRepositoryCustom;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ShowingRepositoryImpl implements ShowingRepositoryCustom {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ShowingDto> getFilterShowings(Predicate predicate) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        QShowing qShowing = QShowing.showing;
        QMovie qMovie = QMovie.movie;
        QShowingDto header = new QShowingDto(qShowing.id,
                new QMovieDto(qShowing.movie.id, qMovie.title, qMovie.year, qMovie.duration, qMovie.description,
                        qMovie.director, qMovie.imageSource),
                qShowing.showingDateTime, qShowing.roomNumber);
        return queryFactory.select(header)
                .from(qShowing)
                .join(qMovie).on(qMovie.id.eq(qShowing.movie.id))
                .where(predicate)
                .fetch();
    }
}
