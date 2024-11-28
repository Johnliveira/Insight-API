package com.zentech.insight.domain.repository;


import com.zentech.insight.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
