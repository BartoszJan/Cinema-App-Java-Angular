package com.bjanczak.CinemaAppJavaAngular.repository;

import com.bjanczak.CinemaAppJavaAngular.model.Showing;
import com.bjanczak.CinemaAppJavaAngular.repository.custom.ShowingRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowingRepository extends JpaRepository<Showing, Long>, ShowingRepositoryCustom{
}
