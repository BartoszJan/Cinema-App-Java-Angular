package com.bjanczak.CinemaAppJavaAngular.model;

import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "showing")
@Setter
public class Showing {

    private Long id;
    private Movie movie;
    private LocalDateTime showingDateTime;
    private int roomNumber;
    private List<Ticket> tickets;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "movie", nullable=false)
    public Movie getMovie() {
        return movie;
    }

    @Column(name = "showing_date_time")
    public LocalDateTime getShowingDateTime() {
        return showingDateTime;
    }

    @Column(name = "room_number")
    public int getRoomNumber() {
        return roomNumber;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "showing")
    public List<Ticket> getTickets() {
        return tickets;
    }
}
