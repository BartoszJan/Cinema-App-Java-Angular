package com.bjanczak.CinemaAppJavaAngular.dto;

import com.bjanczak.CinemaAppJavaAngular.model.Showing;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TicketDto {

    private int id;
    private Showing showing;
    private String userName;
    private String userLastName;
    private int seat;
    private LocalDate purchaseDate;

    @QueryProjection
    public TicketDto(int id, Showing showing, String userName, String userLastName, int seat, LocalDate purchaseDate) {
        this.id = id;
        this.showing = showing;
        this.userName = userName;
        this.userLastName = userLastName;
        this.seat = seat;
        this.purchaseDate = purchaseDate;
    }
}
