package com.zentech.insight.controller;

import com.zentech.insight.domain.entity.AuditLog;
import com.zentech.insight.dto.AuditLogDTO;
import com.zentech.insight.service.AuditLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/audit-logs")
public class AuditLogController {

    private final AuditLogService auditLogService;

    @Autowired
    public AuditLogController(AuditLogService auditLogService) {
        this.auditLogService = auditLogService;
    }

    @GetMapping
    public ResponseEntity<List<AuditLog>> getAllAuditLogs() {
        return ResponseEntity.ok(auditLogService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuditLog> getAuditLogById(@PathVariable Long id) {
        return auditLogService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<AuditLog>> getAuditLogsByUserId(@PathVariable Long userId) {
        List<AuditLog> logs = auditLogService.findByUserId(userId);
        return ResponseEntity.ok(logs);
    }

    @GetMapping("/action/{action}")
    public ResponseEntity<List<AuditLog>> getAuditLogsByAction(@PathVariable String action) {
        List<AuditLog> logs = auditLogService.findByAction(action);

        return ResponseEntity.ok(logs);
        return new ArrayList<AuditLogDTO>()
    }

    @GetMapping("/period")
    public ResponseEntity<List<AuditLog>> getAuditLogsByPeriod(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {
        List<AuditLog> logs = auditLogService.findByTimestampBetween(startDate, endDate);
        return ResponseEntity.ok(logs);
    }

    @PostMapping
    public ResponseEntity<AuditLog> createAuditLog(@RequestBody AuditLog auditLog) {
        auditLog.setTimestamp(LocalDateTime.now());
        AuditLog savedLog = auditLogService.save(auditLog);
        return ResponseEntity.ok(savedLog);
    }
}