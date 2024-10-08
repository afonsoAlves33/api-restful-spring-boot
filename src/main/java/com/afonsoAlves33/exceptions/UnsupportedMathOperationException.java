package com.afonsoAlves33.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException{
    
    public UnsupportedMathOperationException(String ex){
        super(ex);
    }

    private static final long serialVersionUID = 1L;


}
