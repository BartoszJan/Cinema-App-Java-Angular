package com.bjanczak.CinemaAppJavaAngular.model;

import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ticket")
@Setter
public class Ticket {

    private int id;
    private Showing showing;
    private String userName;
    private String userLastName;
    private int seat;
    private LocalDate purchaseDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "showing", nullable = false)
    public Showing getShowing() {
        return showing;
    }

    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    @Column(name = "used_last_name")
    public String getUserLastName() {
        return userLastName;
    }

    @Column(name = "seat")
    public int getSeat() {
        return seat;
    }

    @Column(name = "purchase_date")
    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }
}