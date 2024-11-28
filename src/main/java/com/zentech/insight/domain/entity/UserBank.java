package com.zentech.insight.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "user_banks")
public class UserBank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id", nullable = false)
    private Long userId;

    @JoinColumn(name = "bank_id", nullable = false)
    private Long bankId;

    @Column(name = "initial_balance", nullable = false)
    private BigDecimal initialBalance;

    @Column(name = "current_balance", nullable = false)
    private BigDecimal currentBalance;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
