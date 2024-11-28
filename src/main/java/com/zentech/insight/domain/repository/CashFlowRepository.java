package com.zentech.insight.domain.repository;

import com.zentech.insight.domain.entity.CashFlow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashFlowRepository extends JpaRepository<CashFlow, Long> {
}
