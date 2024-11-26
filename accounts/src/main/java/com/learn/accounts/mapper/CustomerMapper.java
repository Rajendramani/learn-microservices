package com.learn.accounts.mapper;

import com.learn.accounts.dto.CustomerDTO;
import com.learn.accounts.entity.Customer;

public class CustomerMapper {
    public static CustomerDTO mapToCustomerDTO(Customer customer, CustomerDTO customerDTO) {
        customerDTO.setName(customer.getName());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setMobile_number(customer.getMobile_number());
        return customerDTO;
    }

    public static Customer mapToCustomer(CustomerDTO customerDTO, Customer customer) {
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        customer.setMobile_number(customerDTO.getMobile_number());
        return customer;
    }
}
