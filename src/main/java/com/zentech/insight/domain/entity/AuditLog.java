package com.zentech.insight.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "audit_logs")
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id", nullable = false)
    private Long userId;

    @Column(nullable = false, length = 100)
    private String action;

    @Column
    private String description;

    @Column(nullable = false)
    private LocalDateTime timestamp;

}
