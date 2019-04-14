package com.bjanczak.CinemaAppJavaAngular.model;

import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "movie")
@Setter
public class Movie {

    private Long id;
    private String title;
    private LocalDate year;
    private int duration;
    private String director;
    private List<Showing> showings;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Column(name = "year")
    public LocalDate getYear() {
        return year;
    }

    @Column(name = "duration")
    public int getDuration() {
        return duration;
    }

    @Column(name = "director")
    public String getDirector() {
        return director;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, orphanRemoval = true, mappedBy = "movie")
    public List<Showing> getShowings() {
        return showings;
    }
}