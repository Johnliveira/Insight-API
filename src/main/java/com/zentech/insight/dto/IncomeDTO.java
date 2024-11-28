package com.zentech.insight.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class IncomeDTO {

    private Long id;

    private Long userId;

    private String source;

    private BigDecimal amount;

    private LocalDate dateReceived;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
