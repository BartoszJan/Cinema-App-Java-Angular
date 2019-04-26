package com.bjanczak.CinemaAppJavaAngular.controller;

import com.bjanczak.CinemaAppJavaAngular.dto.ShowingDto;
import com.bjanczak.CinemaAppJavaAngular.service.ShowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowingController {
    private final ShowingService showingService;

    @Autowired
    public ShowingController(ShowingService showingService) {
        this.showingService = showingService;
    }

    @RequestMapping(value = "/showings", method = RequestMethod.GET)
    @ResponseBody
    public List<ShowingDto> getFilterShowings(@RequestParam(value = "search", required = false) String search) {
        return showingService.getFilterShowings(search);
    }
}