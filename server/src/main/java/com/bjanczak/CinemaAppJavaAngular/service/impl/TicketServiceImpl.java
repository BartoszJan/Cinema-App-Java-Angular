package com.bjanczak.CinemaAppJavaAngular.service.impl;

import com.bjanczak.CinemaAppJavaAngular.repository.TicketRepository;
import com.bjanczak.CinemaAppJavaAngular.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService{
    private final TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
}
