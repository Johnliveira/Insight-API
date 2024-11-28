package com.zentech.insight.service;

import com.zentech.insight.domain.entity.UserBank;
import com.zentech.insight.domain.repository.UserBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserBankService {

    private final UserBankRepository userBankRepository;

    @Autowired
    public UserBankService(UserBankRepository userBankRepository) {
        this.userBankRepository = userBankRepository;
    }

    public List<UserBank> findAll() {
        return userBankRepository.findAll();
    }

    public Optional<UserBank> findById(Long id) {
        return userBankRepository.findById(id);
    }

    public UserBank save(UserBank userBank) {
        return userBankRepository.save(userBank);
    }

    public void deleteById(Long id) {
        if (userBankRepository.existsById(id)) {
            userBankRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("UsuárioBanco com o ID " + id + " não encontrado.");
        }
    }
}
