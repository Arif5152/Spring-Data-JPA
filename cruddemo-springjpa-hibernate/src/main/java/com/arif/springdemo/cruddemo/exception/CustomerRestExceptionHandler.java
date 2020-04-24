package com.arif.springdemo.cruddemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerRestExceptionHandler {

	@ExceptionHandler
	public CustomerErrorResponse handleException(CustomerNotFoundException e)
	{
		CustomerErrorResponse error = new CustomerErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		return error ;
		
	}
	
	@ExceptionHandler
	public CustomerErrorResponse handleException(Exception e)
	{
		CustomerErrorResponse error = new CustomerErrorResponse();
		error.setMessage(e.getMessage());
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setTimestamp(System.currentTimeMillis());
		
		return error;
	}
	
}
