package com.bjanczak.CinemaAppJavaAngular.service.impl;

import com.bjanczak.CinemaAppJavaAngular.dto.ShowingDto;
import com.bjanczak.CinemaAppJavaAngular.filter.ShowingFilter;
import com.bjanczak.CinemaAppJavaAngular.repository.ShowingRepository;
import com.bjanczak.CinemaAppJavaAngular.service.ShowingService;
import com.bjanczak.CinemaAppJavaAngular.util.PredicateUtil;
import com.bjanczak.CinemaAppJavaAngular.util.SearchCriteria;
import com.bjanczak.CinemaAppJavaAngular.util.SearchHelper;
import com.querydsl.core.BooleanBuilder;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ShowingServiceImpl implements ShowingService {
    private final ShowingRepository showingRepository;

    @Autowired
    public ShowingServiceImpl(ShowingRepository showingRepository) {
        this.showingRepository = showingRepository;
    }

    @Override
    public List<ShowingDto> getFilterShowings(String search) {
        BooleanBuilder builder = new BooleanBuilder();
        if (StringUtils.isNotEmpty(search)) {
            List<SearchCriteria> searchCriteriaList = SearchHelper.parseSearch(search);
            for (SearchCriteria searchCriteria : searchCriteriaList) {
                Optional<ShowingFilter> filter =
                        Arrays.stream(ShowingFilter.values())
                                .filter(f -> f.getKey().equals(searchCriteria.getKey()))
                                .findFirst();
                filter.ifPresent(showingFilter -> builder.and(PredicateUtil.toPredicate(showingFilter, searchCriteria)));
            }
        }

        return showingRepository.getFilterShowings(builder.getValue());
    }
}