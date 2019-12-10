package com.springboot.h2.h2Demo.exceptionHandler;



import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.springboot.h2.h2Demo.model.ExceptionResponse;

@ControllerAdvice
public class ExceptionInterceptor {

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public final ResponseEntity <ExceptionResponse> handleConstraintViolationException(MethodArgumentTypeMismatchException ex) {
	ExceptionResponse eR = new ExceptionResponse();
	ArrayList<String> error = new ArrayList<String>();
	error.add(ex.getMessage());
	eR.setCode(HttpStatus.BAD_REQUEST.value());
	eR.setDescription(error);
	System.out.println("insideglobalexception GET");
	System.out.println(error);
	return new ResponseEntity<ExceptionResponse>(eR, HttpStatus.BAD_REQUEST);
	} 
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public final ResponseEntity <ExceptionResponse> handleConstraintViolationExceptionForPost(MethodArgumentNotValidException ex) {
	ExceptionResponse eR = new ExceptionResponse();
	eR.setCode(HttpStatus.BAD_REQUEST.value());
	ArrayList<String> errors = new ArrayList<String>();
	ex.getBindingResult().getAllErrors().forEach((error) -> {
	 System.out.println(error.getDefaultMessage());
	 errors.add(error.getDefaultMessage());
	});
	eR.setDescription(errors);
	System.out.println("insideglobalexceptionpost");
	System.out.println(ex);
	System.out.println("insideglobalexceptionpostend");
	return new ResponseEntity<ExceptionResponse>(eR, HttpStatus.BAD_REQUEST);
	} 
}
