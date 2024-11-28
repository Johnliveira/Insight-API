package com.zentech.insight.service;

import com.zentech.insight.domain.entity.Account;
import com.zentech.insight.domain.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Optional<Account> findById(Long id) {
        return accountRepository.findById(id);
    }

    public Account save(Account account) {
        return accountRepository.save(account);
    }

    public void deleteById(Long id) {
        if (accountRepository.existsById(id)) {
            accountRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Conta com o ID " + id + " não encontrada.");
        }
    }

    public Account updateStatus(Long id, String status) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Conta com o ID " + id + " não encontrada."));
        account.setStatus(status);
        return accountRepository.save(account);
    }
}
