package com.financetrackr.backend.resolver;

import java.time.OffsetDateTime;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import com.financetrackr.backend.entity.Expense;
import com.financetrackr.backend.repository.ExpenseRepository;

/**
 * GraphQL resolver for handling expense mutations (create, update, delete)
 */
@Controller
public class ExpenseMutationResolver {

    private final ExpenseRepository expenseRepository;

    public ExpenseMutationResolver(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    /**
     * Mutation to create a new expense record
     * @param input the inputobject containing new expense fields
     * @return the saved Expense object
     */
    @MutationMapping
    public Expense createExpense(@Argument("input") CreateExpenseInput input){
        Expense expense = new Expense(
            input.getTitle(),
            input.getAmount(),
            input.getCategory(),
            input.getDate(),
            input.getNotes()
        );
        expense.setCreatedAt(OffsetDateTime.now());
        expense.setUpdatedAt(OffsetDateTime.now());
        
        return expenseRepository.save(expense);
    }
}