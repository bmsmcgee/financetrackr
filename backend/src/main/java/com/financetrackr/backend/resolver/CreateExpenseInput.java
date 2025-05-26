package com.financetrackr.backend.resolver;

import java.time.LocalDate;

import com.financetrackr.backend.entity.ExpenseCategory;

/**
 * Input DTO for creating an expense via GraphQL mutation
 */
public class CreateExpenseInput {

    private String title;
    private Double amount;
    private ExpenseCategory category;
    private LocalDate date;
    private String notes;

    /**
     * Required no-arg constructor
     */
    public CreateExpenseInput() {}

    /**
     * Getters
     */
    public String getTitle(){
        return title;
    }

    public Double getAmount(){
        return amount;
    }

    public ExpenseCategory getCategory(){
        return category;
    }

    public LocalDate getDate(){
        return date;
    }

    public String getNotes(){
        return notes;
    }

    /**
     * Setters
     */
    public void setTitle(String title){
        this.title = title;
    }

    public void setAmount(Double amount){
        this.amount = amount;
    }

    public void setCategory(ExpenseCategory category){
        this.category = category;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }
    
}