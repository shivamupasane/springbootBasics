package com.springboot.h2.h2Demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;


@Entity

public class Employee {
	@Id
	@GeneratedValue
	private int id;
	@NotEmpty(message = "name should not be empty")
	private String name;
	private String dept;
	
	@Range(min=1000, max=10000, message="salary must be in between 1000 and 10000")
	private double salary;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public double getSalary() {
		return salary;
	}

}
