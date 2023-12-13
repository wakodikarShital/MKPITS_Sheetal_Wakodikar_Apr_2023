package com.example.SpringBootRestApplication.globalException;

import com.example.SpringBootRestApplication.exceptionHandling.ErrorDetail;
import com.example.SpringBootRestApplication.exceptionHandling.Record_NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController {
    @ExceptionHandler
    public ResponseEntity<ErrorDetail> handlingException(Record_NotFoundException exception){
        ErrorDetail errorDetail = new ErrorDetail();
        errorDetail.setStatusCode(HttpStatus.NOT_FOUND.value());
        errorDetail.setMessage(exception.getMessage());
        errorDetail.setTimeStamp(System.currentTimeMillis());    // currentTimeMillis() is a method of static System class
        return new ResponseEntity<>(errorDetail , HttpStatus.NOT_FOUND);



    }
}
