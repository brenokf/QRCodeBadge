package com.aplication.QRCodeBadgeGenerator.controller;

import com.aplication.QRCodeBadgeGenerator.exception.UserNOtFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ResourceAdvise {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserNOtFoundException.class)
    public void notFound(){

    }

}
