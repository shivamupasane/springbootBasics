package com.springboot.h2.h2Demo.model;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ExceptionResponse {
private int code;
private String description;
public int getCode() {
	return code;
}
public void setCode(int badRequest) {
	this.code = badRequest;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
