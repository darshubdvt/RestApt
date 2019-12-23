package com.evolvusion.rest.restapi.idao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.evolvusion.rest.restapi.bean.Employee;


public interface IEmployeeDao {
	
	public List<Employee> findAll();
	
	
	public void save(Employee emp);


	public Optional<Employee> getById(Long id);
	
	List<Employee> getAllByJdbc();
}
