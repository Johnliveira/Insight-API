package com.zentech.insight.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CashFlowDTO {
    private Long id;

    private Long userId;

    private Long bankId;

    private BigDecimal entries;

    private BigDecimal exits;

    private BigDecimal balance;

    private String timePeriod;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
