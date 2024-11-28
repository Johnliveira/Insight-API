package com.zentech.insight.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FinancialSummaryDTO {

    private Long id;

    private Long userId;

    private BigDecimal totalIncome;

    private BigDecimal totalExpenses;

    private BigDecimal netProfit;

    private String timePeriod;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
