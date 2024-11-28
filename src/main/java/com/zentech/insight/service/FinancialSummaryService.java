package com.zentech.insight.service;

import com.zentech.insight.domain.entity.FinancialSummary;
import com.zentech.insight.domain.repository.FinancialSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinancialSummaryService {

    private final FinancialSummaryRepository financialSummaryRepository;

    @Autowired
    public FinancialSummaryService(FinancialSummaryRepository financialSummaryRepository) {
        this.financialSummaryRepository = financialSummaryRepository;
    }

    public List<FinancialSummary> findAll() {
        return financialSummaryRepository.findAll();
    }

    public Optional<FinancialSummary> findById(Long id) {
        return financialSummaryRepository.findById(id);
    }

    public FinancialSummary save(FinancialSummary financialSummary) {
        return financialSummaryRepository.save(financialSummary);
    }

    public void deleteById(Long id) {
        if (financialSummaryRepository.existsById(id)) {
            financialSummaryRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Resumo financeiro com o ID " + id + " não encontrado.");
        }
    }
}
