package com.example.SpringBootCoreConcept.config;

import com.example.SpringBootCoreConcept.AccountDeails.Account;
import com.example.SpringBootCoreConcept.AccountDeails.LoanAccount;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {
    @Bean
    public Account loanAccount(){
        return new LoanAccount();
    }
}
