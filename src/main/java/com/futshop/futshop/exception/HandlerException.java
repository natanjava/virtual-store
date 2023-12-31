package com.futshop.futshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class HandlerException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RequestException.class)
    public ResponseEntity<MessageExceptionHandler> tratarRequestExceptions(Exception exception){
        MessageExceptionHandler erro = new MessageExceptionHandler(
                new Date(),
                HttpStatus.UNAUTHORIZED.value(),
                "Not authorized",
                exception.getMessage()
        );
        return new ResponseEntity(erro, HttpStatus.UNAUTHORIZED);
    }
}
