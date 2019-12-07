package com.springboot.h2.h2Demo.model;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ExceptionResponse {
private HttpStatus code;
private String description;
public HttpStatus getCode() {
	return code;
}
public void setCode(HttpStatus badRequest) {
	this.code = badRequest;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
