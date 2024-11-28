package com.zentech.insight.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExpenseDTO {

    private Long id;

    private Long userId;

    private Long categoryId;

    private BigDecimal amount;

    private LocalDate dueDate;

    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
