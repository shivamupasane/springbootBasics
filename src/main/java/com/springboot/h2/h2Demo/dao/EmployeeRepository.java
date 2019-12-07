package com.springboot.h2.h2Demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.h2.h2Demo.model.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{

	Employee findByid(int id);

}
