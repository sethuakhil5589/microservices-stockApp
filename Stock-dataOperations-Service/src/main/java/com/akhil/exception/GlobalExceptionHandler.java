package com.akhil.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CompanyNotFound.class)
	public ResponseEntity<Object> handleCompanyNotFoundException(CompanyNotFound c){
		return new ResponseEntity<>(c.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
}
