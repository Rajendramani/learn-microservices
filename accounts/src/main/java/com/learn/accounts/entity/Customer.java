package com.learn.accounts.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private Long customer_id;
    private String name;
    private String email;
    private String mobile_number;
}
