package com.zentech.insight.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class AccountDTO {

    private Long id;

    private Long userId;

    private String type;

    private BigDecimal amount;

    private LocalDate dueDate;

    private String status;

    private String description;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
