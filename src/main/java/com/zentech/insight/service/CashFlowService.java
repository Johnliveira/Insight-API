package com.zentech.insight.service;

import com.zentech.insight.domain.entity.CashFlow;
import com.zentech.insight.domain.repository.CashFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CashFlowService {

    private final CashFlowRepository cashFlowRepository;

    @Autowired
    public CashFlowService(CashFlowRepository cashFlowRepository) {
        this.cashFlowRepository = cashFlowRepository;
    }

    public List<CashFlow> findAll() {
        return cashFlowRepository.findAll();
    }

    public Optional<CashFlow> findById(Long id) {
        return cashFlowRepository.findById(id);
    }

    public CashFlow save(CashFlow cashFlow) {
        return cashFlowRepository.save(cashFlow);
    }

    public void deleteById(Long id) {
        if (cashFlowRepository.existsById(id)) {
            cashFlowRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Fluxo de caixa com o ID " + id + " não encontrado.");
        }
    }
}
