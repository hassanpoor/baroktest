package com.example.BarokTest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdviceController {
    @ExceptionHandler(value = UserNotFound.class)
    public ResponseEntity<String> exception(UserNotFound userNotFound) {
        return new ResponseEntity<>(userNotFound.getMessage(), HttpStatus.NOT_FOUND);
    }
}
