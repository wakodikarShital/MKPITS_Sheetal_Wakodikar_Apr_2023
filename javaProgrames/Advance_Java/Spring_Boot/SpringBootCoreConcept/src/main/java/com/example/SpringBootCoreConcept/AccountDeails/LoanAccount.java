package com.example.SpringBootCoreConcept.AccountDeails;
//treated as bean , so we create one another class BankConfig in the package of config
public class LoanAccount implements Account{
    @Override
    public String accountType() {
        return "Loan Account";
    }
}
