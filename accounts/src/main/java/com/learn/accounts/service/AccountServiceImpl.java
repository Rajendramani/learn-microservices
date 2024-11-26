package com.learn.accounts.service;

import org.springframework.stereotype.Service;

import com.learn.accounts.dto.CustomerDTO;
import com.learn.accounts.repository.AccountRepository;
import com.learn.accounts.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDTO customerDTO) {
        throw new UnsupportedOperationException("Unimplemented method 'createAccount'");
    }
    
}
