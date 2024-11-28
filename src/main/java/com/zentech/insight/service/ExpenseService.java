package com.zentech.insight.service;

import com.zentech.insight.domain.entity.Expense;
import com.zentech.insight.domain.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }

    public Optional<Expense> findById(Long id) {
        return expenseRepository.findById(id);
    }

    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }

    public void deleteById(Long id) {
        if (expenseRepository.existsById(id)) {
            expenseRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Despesa com o ID " + id + " não encontrada.");
        }
    }
}
