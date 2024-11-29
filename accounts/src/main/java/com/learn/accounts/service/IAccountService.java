package com.learn.accounts.service;

import com.learn.accounts.dto.CustomerDTO;

public interface IAccountService {
    
    void createAccount(CustomerDTO customerDTO);

    CustomerDTO fetchAccoutn(String mobileNumber);

    boolean updateAccount(CustomerDTO customerDto);

    boolean deleteAccount(String mobileNumber);
}
