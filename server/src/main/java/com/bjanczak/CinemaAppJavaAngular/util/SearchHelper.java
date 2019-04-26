package com.bjanczak.CinemaAppJavaAngular.util;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class SearchHelper {

    public static final String REGEX = ",";

    public static List<SearchCriteria> parseSearch(String search) {
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();
        String[] splitValue = search.split(REGEX);
        for (String value : splitValue) {
            SearchCriteria searchCriteria = new SearchCriteria();
            for (String c : SearchOperationEnum.SIMPLE_OPERATION_SET) {
                if (value.contains(c)) {
                    searchCriteria.setKey(StringUtils.substringBefore(value, c));
                    searchCriteria.setOperation(SearchOperationEnum.getSimpleOperation(c.charAt(0)));
                    searchCriteria.setValue(StringUtils.substringAfter(value, c));
                    break;
                }
            }
            searchCriteriaList.add(searchCriteria);
        }
        return searchCriteriaList;
    }
}
