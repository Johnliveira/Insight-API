package com.zentech.insight.service;

import com.zentech.insight.domain.entity.UserPreferences;
import com.zentech.insight.domain.repository.UserPreferencesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserPreferencesService {

    private final UserPreferencesRepository userPreferencesRepository;

    @Autowired
    public UserPreferencesService(UserPreferencesRepository userPreferencesRepository) {
        this.userPreferencesRepository = userPreferencesRepository;
    }

    public List<UserPreferences> findAll() {
        return userPreferencesRepository.findAll();
    }

    public Optional<UserPreferences> findById(Long id) {
        return userPreferencesRepository.findById(id);
    }

    public UserPreferences save(UserPreferences userPreferences) {
        return userPreferencesRepository.save(userPreferences);
    }

    public void deleteById(Long id) {
        if (userPreferencesRepository.existsById(id)) {
            userPreferencesRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Preferências do Usuário com o ID " + id + " não encontrado.");
        }
    }
}
