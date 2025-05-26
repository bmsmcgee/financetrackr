package com.financetrackr.backend.entity;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represent a user-recorded financial transaction.
 * Mapped to "expense" table in PostgreSQL
 */
@Entity
@Table(name = "expense")
public class Expense {

    /**
     * Unique identifier for ID
     */
    @Id
    @GeneratedValue
    private UUID id;

    /**
     * Short label or description of the expense
     */
    @Column(nullable = false)
    private String title;

    /**
     * Amount spent on transaction
     */
    @Column(nullable = false)
    private Double amount;

    /**
     * Categorization of the expense
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ExpenseCategory category;

    /**
     * Date the expense occurred
     */
    @Column(nullable = false)
    private LocalDate date;

    /**
     * Optional additional notes
     */
    @Column(nullable = true)
    private String notes;

    /**
     * Timestamp of when the expense was created
     */
    @Column(nullable = false)
    private OffsetDateTime createdAt;

    /**
     * Timestamp of when the expense was updated
     */
    private OffsetDateTime updatedAt;

    /**
     * No arg constructor
     */
    public Expense() {}

    /**
     * Convenience constructor for manual insertion
     */
    public Expense(String title, Double amount, ExpenseCategory category, LocalDate date, String notes){
        this.title = title;
        this.amount = amount;
        this.category = category;
        this.notes = notes;
        this.createdAt = OffsetDateTime.now();
        this.updatedAt = OffsetDateTime.now();
    }

    /**
     * Getters
     */
    public UUID getId(){
        return id;
    }

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

    public OffsetDateTime getCreatedAt(){
        return createdAt;
    }

    public OffsetDateTime getUpdatedAt(){
        return updatedAt;
    }

    /**
     * Setters
     */
    public void setId(UUID id){
        this.id = id;
    }

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

    public void setCreatedAt(OffsetDateTime createdAt){
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt){
        this.updatedAt = updatedAt;
    }
}