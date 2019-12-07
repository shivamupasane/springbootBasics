package com.springboot.h.hDemo.exceptionHandler;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springboot.h2.h2Demo.model.ExceptionResponse;

@ControllerAdvice
public class ExceptionInterceptor {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity <ExceptionResponse> handleConstraintViolationException(ConstraintViolationException ex) {
	ExceptionResponse eR = new ExceptionResponse();
	eR.setCode(HttpStatus.BAD_REQUEST);
	eR.setDescription(ex.getMessage());
	System.out.println("insideglobalexception");
	return new ResponseEntity<ExceptionResponse>(eR, HttpStatus.BAD_REQUEST);
	} 
}
