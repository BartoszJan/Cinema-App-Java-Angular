package com.bjanczak.CinemaAppJavaAngular.controller;

import com.bjanczak.CinemaAppJavaAngular.service.ShowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowingController {
    private final ShowingService showingService;

    @Autowired
    public ShowingController(ShowingService showingService) {
        this.showingService = showingService;
    }
}
