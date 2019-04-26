package com.bjanczak.CinemaAppJavaAngular.util;

import com.bjanczak.CinemaAppJavaAngular.filter.AbstractFilter;
import com.querydsl.core.types.Ops;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.Expressions;


public class PredicateUtil {

    public static Predicate toPredicate(AbstractFilter filter, SearchCriteria criteria) {

        switch (criteria.getOperation()) {
            case EQUALITY:
                return Expressions.predicate(Ops.EQ, filter.getPath(),
                        QueryDslUtils.constantExpression(filter.getType(), criteria.getValue()));
            case NEGATION:
                return Expressions.predicate(Ops.NE, filter.getPath(),
                        QueryDslUtils.constantExpression(filter.getType(), criteria.getValue()));
            case GREATER_THAN:
                return Expressions.predicate(Ops.GT, filter.getPath(),
                        QueryDslUtils.constantExpression(filter.getType(), criteria.getValue()));
            case LESS_THAN:
                return Expressions.predicate(Ops.LT, filter.getPath(),
                        QueryDslUtils.constantExpression(filter.getType(), criteria.getValue()));
            case LIKE:
                return Expressions.predicate(Ops.LIKE, filter.getPath(),
                        QueryDslUtils.constantExpression(filter.getType(), criteria.getValue()));
            case STARTS_WITH:
                return Expressions.predicate(Ops.STARTS_WITH, filter.getPath(),
                        QueryDslUtils.constantExpression(filter.getType(), criteria.getValue()));
            case ENDS_WITH:
                return Expressions.predicate(Ops.ENDS_WITH, filter.getPath(),
                        QueryDslUtils.constantExpression(filter.getType(), criteria.getValue()));
            case CONTAINS:
                return Expressions.predicate(Ops.STRING_CONTAINS, filter.getPath(),
                        QueryDslUtils.constantExpression(filter.getType(), criteria.getValue()));
            default:
                return null;
        }
    }
}
