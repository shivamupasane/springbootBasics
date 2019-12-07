package com.springboot.h2.h2Demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity

public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String dept;
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
	private double salary;

}
