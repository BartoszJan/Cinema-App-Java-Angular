package com.bjanczak.CinemaAppJavaAngular.filter;

import com.querydsl.core.types.Path;

public interface AbstractFilter {
    String getKey();
    Path getPath();
    FilterClassType getType();
}
