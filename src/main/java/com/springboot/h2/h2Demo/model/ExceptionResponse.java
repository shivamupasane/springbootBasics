package com.springboot.h2.h2Demo.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class ExceptionResponse {
private int code;

private ArrayList<String> description;
public int getCode() {
	return code;
}
public void setCode(int badRequest) {
	this.code = badRequest;
}
public ArrayList<String> getDescription() {
	return description;
}
public void setDescription(ArrayList<String> description) {
	this.description = description;
}
}
