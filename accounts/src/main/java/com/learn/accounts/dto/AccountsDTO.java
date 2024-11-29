package com.learn.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDTO {
    @NotEmpty(message ="Account number should not be null or empty")  
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private long accountNumber;
    @NotEmpty(message ="Account Type should not be null or empty")  
    private String accountType;
    @NotEmpty(message ="Branch address should not be null or empty")  
    private String branchAddress;  
    
}