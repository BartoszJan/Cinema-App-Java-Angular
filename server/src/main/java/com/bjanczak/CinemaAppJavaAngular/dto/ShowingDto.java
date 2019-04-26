package com.bjanczak.CinemaAppJavaAngular.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ShowingDto {

    private Long id;
    private MovieDto movie;
    private LocalDateTime showingDateTime;
    private int roomNumber;

    @QueryProjection
    public ShowingDto(Long id, MovieDto movie, LocalDateTime showingDateTime, int roomNumber) {
        this.id = id;
        this.movie = movie;
        this.showingDateTime = showingDateTime;
        this.roomNumber = roomNumber;
    }
}
