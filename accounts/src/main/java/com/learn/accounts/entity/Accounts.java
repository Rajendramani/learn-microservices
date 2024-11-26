package com.learn.accounts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Accounts extends BaseEntity{
    private long customer_id;
    @Id
    private long account_number;
    private String account_type;
    private String branch_address;
}
