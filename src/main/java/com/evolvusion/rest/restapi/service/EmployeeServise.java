package com.evolvusion.rest.restapi.service;

import java.util.List;
import java.util.Optional;

import com.evolvusion.rest.restapi.bean.Employee;

public interface EmployeeServise {

	public List<Employee> findAll();
	
	public String addAll(Employee emp);

	Optional<Employee> getById(Long id);
	
	List<Employee> getAllByJdbc();
}
