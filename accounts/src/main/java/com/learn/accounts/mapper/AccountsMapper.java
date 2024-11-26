package com.learn.accounts.mapper;

import com.learn.accounts.dto.AccountsDTO;
import com.learn.accounts.entity.Accounts;

public class AccountsMapper {
    public static AccountsDTO mapToAccountsDTO(Accounts accounts,AccountsDTO accountsDTO) {
        accountsDTO.setAccount_number(accounts.getAccount_number());
        accountsDTO.setAccount_type(accounts.getAccount_type());
        accountsDTO.setBranch_address(accounts.getBranch_address());
        return accountsDTO;
    }

    public static Accounts mapToAccounts(AccountsDTO accountsDTO,Accounts accounts) {
        accounts.setAccount_number(accountsDTO.getAccount_number());
        accounts.setAccount_type(accountsDTO.getAccount_type());
        accounts.setBranch_address(accountsDTO.getBranch_address());
        return accounts;
    }
}
