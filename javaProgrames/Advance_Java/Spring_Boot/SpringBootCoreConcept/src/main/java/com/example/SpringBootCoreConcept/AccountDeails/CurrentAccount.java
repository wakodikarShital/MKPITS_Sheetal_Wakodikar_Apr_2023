package com.example.SpringBootCoreConcept.AccountDeails;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CurrentAccount implements Account{
    public CurrentAccount(){
        System.out.println("This is current account constructor");
    }
    @Override
    public String accountType() {
        return "This is current account";

    }

    @PostConstruct
    public void startUpWork(){
        System.out.println("start");
    }

    @PreDestroy
    public void distroOfWork(){
        System.out.println("End");
    }


}
