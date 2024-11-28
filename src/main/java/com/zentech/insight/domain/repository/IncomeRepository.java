package com.zentech.insight.domain.repository;

import com.zentech.insight.domain.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}
