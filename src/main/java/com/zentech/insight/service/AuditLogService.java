package com.zentech.insight.service;

import com.zentech.insight.domain.entity.AuditLog;
import com.zentech.insight.domain.repository.AuditLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuditLogService {

    private final AuditLogRepository auditLogRepository;

    @Autowired
    public AuditLogService(AuditLogRepository auditLogRepository) {
        this.auditLogRepository = auditLogRepository;
    }

    public List<AuditLog> findAll() {
        return auditLogRepository.findAll();
    }

    public Optional<AuditLog> findById(Long id) {
        return auditLogRepository.findById(id);
    }

    public AuditLog save(AuditLog auditLog) {
        return auditLogRepository.save(auditLog);
    }

    public void deleteById(Long id) {
        if (auditLogRepository.existsById(id)) {
            auditLogRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Log de auditoria com o ID " + id + " não encontrado.");
        }
    }
}
