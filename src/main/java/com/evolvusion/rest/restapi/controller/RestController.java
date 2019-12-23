package com.evolvusion.rest.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.evolvusion.rest.restapi.bean.Employee;
import com.evolvusion.rest.restapi.bean.Response;
import com.evolvusion.rest.restapi.service.EmployeeServise;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private EmployeeServise emploServise;

	public EmployeeServise getEmploServise() {
		return emploServise;
	}

	public void setEmploServise(EmployeeServise emploServise) {
		this.emploServise = emploServise;
	}

	@GetMapping(value = "/getAll", consumes = "application/json", produces = "application/json")
	public List<Employee> getEmployees() {
		//return emploServise.findAll();
		
		return (emploServise.findAll());
	}

	@PutMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addEmployees(@RequestBody Employee employee) {
		//Response response = new Response();
		 emploServise.addAll(employee);
		//response.setResponseCode(reCode);
		return new ResponseEntity<>("SAVED SUCCESSFULLY ..",HttpStatus.OK);

	}
	
	@GetMapping(value = "/get/{id}", consumes = "application/json", produces = "application/json")
	public Optional<Employee> addEmployees(@PathVariable Long id) {
		
		Optional<Employee> employee= emploServise.getById(id);
		
		
		return employee;

	}
}
