package com.akhil.exception;



public class CompanyNotFound extends RuntimeException{
	
	public CompanyNotFound(String msg) {
		super(msg);
	}
}
