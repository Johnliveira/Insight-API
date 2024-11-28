package com.zentech.insight.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "financial_summary")
public class FinancialSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "total_income", nullable = false)
    private BigDecimal totalIncome;

    @Column(name = "total_expenses", nullable = false)
    private BigDecimal totalExpenses;

    @Column(name = "net_profit", nullable = false)
    private BigDecimal netProfit;

    @Column(name = "time_period", nullable = false, length = 50)
    private String timePeriod;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
