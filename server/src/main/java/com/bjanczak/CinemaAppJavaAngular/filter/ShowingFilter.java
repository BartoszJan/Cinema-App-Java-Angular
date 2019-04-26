package com.bjanczak.CinemaAppJavaAngular.filter;

import com.bjanczak.CinemaAppJavaAngular.model.QShowing;
import com.querydsl.core.types.Path;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ShowingFilter implements AbstractFilter{
    ID("id", QShowing.showing.id, FilterClassType.NUMBER),
    MOVIE("movie", QShowing.showing.movie.id, FilterClassType.NUMBER),
    SHOWING_DATE_TIME("showingDateTime", QShowing.showing.showingDateTime, FilterClassType.DATE),
    ROOM_NUMBER("roomNumber", QShowing.showing.roomNumber, FilterClassType.NUMBER);

    private String key;
    private Path path;
    private FilterClassType type;
}
