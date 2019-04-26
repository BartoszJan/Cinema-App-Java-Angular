package com.bjanczak.CinemaAppJavaAngular.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchCriteria {
    private String key;
    private SearchOperationEnum operation;
    private String value;
}
