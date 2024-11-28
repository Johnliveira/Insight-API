package com.zentech.insight.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDTO {

    private Long id;

    private Long userId;

    private Long bankId;

    private String type;

    private BigDecimal amount;

    private LocalDateTime date;

    private Long categoryId;

    private String description;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
