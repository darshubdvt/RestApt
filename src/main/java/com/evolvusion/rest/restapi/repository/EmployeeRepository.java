package com.evolvusion.rest.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.evolvusion.rest.restapi.bean.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	/*
	 * List<Employee> findAll();
	 * 
	 * void saveAndFlush(Employee emp);
	 */	

}
