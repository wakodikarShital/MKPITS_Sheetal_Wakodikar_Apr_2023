package com.example.SpringBootCoreConcept.AccountDeails;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SavingAccount implements Account{
    public void SavingAccount(){
        System.out.println("This is saving account constructor");
    }
    @Override
    public String accountType() {

        return "This is Saving account";
    }
}
