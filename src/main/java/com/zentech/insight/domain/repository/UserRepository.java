package com.zentech.insight.domain.repository;

import com.zentech.insight.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
