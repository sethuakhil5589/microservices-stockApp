package com.akhil.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class ExceptionHandlingAspect {

	@Pointcut("execution(* com.akhil.controller.stocksCalController.*(..))")
	public void restControllerMethods() {
		
	}
	
	@Pointcut("execution(* com.akhil.Service.StocksServiceImpl.*(..))")
	public void serviceMethods() {
		
	}
	
	@Pointcut("execution(* com.akhil.feign.IStocksInterface.*(..))")
	public void feignMethods() {
		
	}
	
	@AfterThrowing(pointcut = "restControllerMethods()",throwing = "exception")
	public ResponseEntity<?> handleExceptionC(Exception exception) {
		return new ResponseEntity<>("Company Not found", HttpStatus.NOT_FOUND);
	}
	
	@AfterThrowing(pointcut = "serviceMethods()",throwing = "exception")
	public ResponseEntity<?> handleExceptionS(Exception exception) {
		return new ResponseEntity<>("Company Not found", HttpStatus.NOT_FOUND);
	}
	
	@AfterThrowing(pointcut = "feignMethods()",throwing = "exception")
	public ResponseEntity<?> handleExceptionF(Exception exception) {
		return new ResponseEntity<>("Company Not found", HttpStatus.NOT_FOUND);
	}
}
