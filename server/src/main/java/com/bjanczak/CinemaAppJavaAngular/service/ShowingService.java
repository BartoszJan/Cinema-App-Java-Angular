package com.bjanczak.CinemaAppJavaAngular.service;

import com.bjanczak.CinemaAppJavaAngular.dto.ShowingDto;

import java.util.List;

public interface ShowingService {

    /**
     * return list of showings filter by given search value
     */
    List<ShowingDto> getFilterShowings(String search);
}
