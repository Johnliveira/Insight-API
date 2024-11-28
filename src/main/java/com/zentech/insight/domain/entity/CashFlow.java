package com.zentech.insight.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "cash_flow")
public class CashFlow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id", nullable = false)
    private Long userId;

    @JoinColumn(name = "bank_id", nullable = false)
    private Long bankId;

    @Column(nullable = false)
    private BigDecimal entries;

    @Column(nullable = false)
    private BigDecimal exits;

    @Column(nullable = false)
    private BigDecimal balance;

    @Column(name = "time_period", nullable = false, length = 50)
    private String timePeriod;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
