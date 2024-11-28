package com.zentech.insight.domain.repository;

import com.zentech.insight.domain.entity.UserPreferences;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPreferencesRepository extends JpaRepository<UserPreferences, Long> {
}
