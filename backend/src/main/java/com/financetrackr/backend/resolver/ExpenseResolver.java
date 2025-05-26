package com.financetrackr.backend.resolver;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.financetrackr.backend.entity.Expense;
import com.financetrackr.backend.repository.ExpenseRepository;

/**
 * GraphQL resolver that handles all read/query operations for Expense data.
 */
@Controller
public class ExpenseResolver {

    private final ExpenseRepository expenseRepository;

    /**
     * Constructor-based injection of the ExpenseRepository.
     * @param expenseRepository the JPA repository for Expense entities.
     */
    public ExpenseResolver(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    /**
     * GraphQL query that returns a list of all stored expenses.
     * Maps to: query { expense }
     * @return a list of Expense objects
     */
    @QueryMapping
    public List<Expense> expenses() {
        return expenseRepository.findAll();
    }
}