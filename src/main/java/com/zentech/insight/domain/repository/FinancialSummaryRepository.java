package com.zentech.insight.domain.repository;

import com.zentech.insight.domain.entity.FinancialSummary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialSummaryRepository extends JpaRepository<FinancialSummary, Long> {
}
