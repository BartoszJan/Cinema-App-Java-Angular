package com.bjanczak.CinemaAppJavaAngular.util;

import com.bjanczak.CinemaAppJavaAngular.filter.FilterClassType;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.dsl.Expressions;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;


@UtilityClass
public class QueryDslUtils {

    public static Expression constantExpression(FilterClassType type, String value) {
        if (FilterClassType.STRING.equals(type))
            return Expressions.asString(value);
        else if (FilterClassType.DATE.equals(type))
            return Expressions.asDate(LocalDate.parse(value));
        else
            return Expressions.asNumber(Long.valueOf(value));
    }
}
