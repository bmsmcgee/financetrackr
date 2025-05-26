package com.financetrackr.backend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financetrackr.backend.entity.Expense;

/**
 * Repository interface for accessing and managing Expense entities.
 * Extends JpaRepository to inherit CRUD operations and query capabilities.
 */
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, UUID>{

    
}