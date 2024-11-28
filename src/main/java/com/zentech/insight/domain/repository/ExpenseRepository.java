package com.zentech.insight.domain.repository;

import com.zentech.insight.domain.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
