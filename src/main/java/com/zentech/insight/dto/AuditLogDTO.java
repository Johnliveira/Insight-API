package com.zentech.insight.dto;

import java.time.LocalDateTime;

public class AuditLogDTO {

    private Long id;

    private Long userId;

    private String action;

    private String description;

    private LocalDateTime timestamp;

}
