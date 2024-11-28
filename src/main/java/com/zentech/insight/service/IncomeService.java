package com.zentech.insight.service;

import com.zentech.insight.domain.entity.Income;
import com.zentech.insight.domain.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncomeService {

    private final IncomeRepository incomeRepository;

    @Autowired
    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public List<Income> findAll() {
        return incomeRepository.findAll();
    }

    public Optional<Income> findById(Long id) {
        return incomeRepository.findById(id);
    }

    public Income save(Income income) {
        return incomeRepository.save(income);
    }

    public void deleteById(Long id) {
        if (incomeRepository.existsById(id)) {
            incomeRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Renda com o ID " + id + " não encontrada.");
        }
    }
}
