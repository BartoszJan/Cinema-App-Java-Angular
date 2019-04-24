package com.bjanczak.CinemaAppJavaAngular.service.impl;

import com.bjanczak.CinemaAppJavaAngular.repository.ShowingRepository;
import com.bjanczak.CinemaAppJavaAngular.service.ShowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowingServiceImpl implements ShowingService{
    private final ShowingRepository showingRepository;

    @Autowired
    public ShowingServiceImpl(ShowingRepository showingRepository) {
        this.showingRepository = showingRepository;
    }
}
