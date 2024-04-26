package com.akhil.aop;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import feign.FeignException;
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(FeignException.class)
    public ResponseEntity<String> handleFeignException(FeignException ex) {
        if (ex.status() == HttpStatus.NOT_FOUND.value() && ex.getMessage().contains("Company Not Found")) {
            return new ResponseEntity<>("Company Not found", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>("An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
