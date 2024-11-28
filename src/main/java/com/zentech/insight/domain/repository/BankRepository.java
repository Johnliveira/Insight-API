package com.zentech.insight.domain.repository;

import com.zentech.insight.domain.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
