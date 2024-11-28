package com.zentech.insight.domain.repository;

import com.zentech.insight.domain.entity.UserBank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBankRepository extends JpaRepository<UserBank, Long> {
}
