package com.zentech.insight.domain.repository;

import com.zentech.insight.domain.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
