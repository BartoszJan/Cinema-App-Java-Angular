package com.bjanczak.CinemaAppJavaAngular.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MovieDto {

    private Long id;
    private String title;
    private LocalDate year;
    private int duration;
    private String description;
    private String director;
    private String imageSource;

    @QueryProjection
    public MovieDto(Long id, String title, LocalDate year, int duration, String description, String director, String imageSource) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.director = director;
        this.imageSource = imageSource;
        this.description = description;
    }
}
