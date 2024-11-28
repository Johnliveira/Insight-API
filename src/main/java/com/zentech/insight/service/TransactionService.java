package com.zentech.insight.service;

import com.zentech.insight.domain.entity.Transaction;
import com.zentech.insight.domain.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> findById(Long id) {
        return transactionRepository.findById(id);
    }

    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public void deleteById(Long id) {
        if (transactionRepository.existsById(id)) {
            transactionRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Transação com o ID " + id + " não encontrada.");
        }
    }
}
