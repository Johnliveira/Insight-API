package com.zentech.insight.service;

import com.zentech.insight.domain.entity.Bank;
import com.zentech.insight.domain.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {

    private final BankRepository bankRepository;

    @Autowired
    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public List<Bank> findAll() {
        return bankRepository.findAll();
    }

    public Optional<Bank> findById(Long id) {
        return bankRepository.findById(id);
    }

    public Bank save(Bank bank) {
        return bankRepository.save(bank);
    }

    public void deleteById(Long id) {
        if (bankRepository.existsById(id)) {
            bankRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Banco com o ID " + id + " não encontrado.");
        }
    }
}
