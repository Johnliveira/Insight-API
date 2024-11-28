package com.zentech.insight.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class UserBankDTO {

    private Long id;

    private Long userId;

    private Long bankId;

    private BigDecimal initialBalance;

    private BigDecimal currentBalance;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
