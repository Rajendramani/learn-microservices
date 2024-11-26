package com.learn.accounts.dto;

import lombok.Data;

@Data
public class AccountsDTO {
    //Customize account number
    private long account_number;
    private String account_type;
    private String branch_address;  
    
}