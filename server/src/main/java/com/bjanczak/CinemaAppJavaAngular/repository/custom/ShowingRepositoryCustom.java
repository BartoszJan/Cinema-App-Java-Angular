package com.bjanczak.CinemaAppJavaAngular.repository.custom;

import com.bjanczak.CinemaAppJavaAngular.dto.ShowingDto;
import com.querydsl.core.types.Predicate;

import java.util.List;

public interface ShowingRepositoryCustom {

    /**
     * get showings list filter by predicates
     */
    List<ShowingDto> getFilterShowings(Predicate predicate);
}
