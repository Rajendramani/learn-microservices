package com.learn.accounts.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/v1/account")
public class AccountController {

    @GetMapping("/sayhello")
    public String getMethodName() {
        return "Hello world";
    }
    
}
