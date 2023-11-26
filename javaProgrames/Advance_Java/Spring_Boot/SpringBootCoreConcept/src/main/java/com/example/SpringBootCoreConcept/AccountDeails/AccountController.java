package com.example.SpringBootCoreConcept.AccountDeails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    private Account account1;
//    private Account account2;
//@Autowired
//    public AccountController(@Qualifier("currentAccount") Account account1,@Qualifier("currentAccount") Account account2){
//        this.account1=account1;
//        this.account2=account2;
//    }

    @Autowired
    public AccountController(@Qualifier("currentAccount") Account account1){
        this.account1=account1;

    }


//    @GetMapping("/")
//    public String displayDetails(){
//        return account1.accountType();
//    }




//    @GetMapping("/check")
//    public String checkScope(){
//    return "return " + " = "+(account1==account2);
//    }

}
