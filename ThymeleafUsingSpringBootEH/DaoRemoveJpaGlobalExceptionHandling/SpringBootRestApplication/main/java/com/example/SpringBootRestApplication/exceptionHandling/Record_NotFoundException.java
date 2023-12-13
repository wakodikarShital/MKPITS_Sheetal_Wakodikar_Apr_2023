package com.example.SpringBootRestApplication.exceptionHandling;

public class Record_NotFoundException extends RuntimeException{

    public Record_NotFoundException(String message){
        super(message);
    }
}
