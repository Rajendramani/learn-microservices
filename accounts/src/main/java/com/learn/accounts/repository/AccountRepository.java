package com.learn.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.accounts.entity.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, Long> {
    
}
