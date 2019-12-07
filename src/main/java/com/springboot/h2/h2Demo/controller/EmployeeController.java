package com.springboot.h2.h2Demo.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.h2.h2Demo.dao.EmployeeRepository;
import com.springboot.h2.h2Demo.model.Employee;
@Validated
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/Employee")
	public String saveEmployee(@RequestBody Employee employee) {
		repository.save(employee);
		return "employee saved";
	}
	@GetMapping("/Employee/{id}")
	public Employee getEmployee(@PathVariable @NotEmpty @Valid int id) {
		return repository.findByid(id);
	}
	@GetMapping("/Employee")
	public List<Employee> getAllEmployee() {
		System.out.println("getallresponse");
		System.out.println(repository.findAll());
		return repository.findAll();
	}
	

}
