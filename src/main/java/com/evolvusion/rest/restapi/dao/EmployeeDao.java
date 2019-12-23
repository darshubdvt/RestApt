package com.evolvusion.rest.restapi.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.evolvusion.rest.restapi.bean.Employee;
import com.evolvusion.rest.restapi.idao.IEmployeeDao;
import com.evolvusion.rest.restapi.repository.EmployeeRepository;

@Repository
public class EmployeeDao implements IEmployeeDao {

	@Autowired
	private EmployeeRepository repository;
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	public List<Employee> findAll() {

		return repository.findAll();
	}

	@Override
	public void save(Employee emp) {
		
		/*
		 * String sql="INSERT INTO ta_employee" + "(ta_employee_id" + "`first_name`,\n"
		 * + "`last_name`,\n" + "`ta_adress_id`)\n" + "VALUES\n" +
		 * "(<{ta_employee_id: }>,\n" + "<{first_name: }>,\n" + "<{last_name: }>,\n" +
		 * "<{ta_adress_id: }>);\n" + "";
		 * 
		 * List<Employee> employeeList= new ArrayList<>(); for(int i=0;i<5;i++) {
		 * employeeList.add(emp); }
		 * 
		 * jdbctemplate.batchUpdate(sql,new BatchPreparedStatementSetter() {
		 * 
		 * @Override public void setValues(PreparedStatement ps, int i) throws
		 * SQLException { // TODO Auto-generated method stub
		 * 
		 * }
		 * 
		 * @Override public int getBatchSize() { // TODO Auto-generated method stub
		 * return employeeList.size(); } });
		 */
		
		repository.save(emp);

	}

	@Override
	public Optional<Employee> getById(Long id) {
		Optional<Employee> empoyee= null;
		
		empoyee = repository.findById(id);
		
		return empoyee;
	}

	@Override
	public List<Employee> getAllByJdbc() {
		List<Employee> allexisting=new ArrayList<Employee>();
		try {
			Query qry=entitymanager.createQuery("from Employee emp", Employee.class);
			allexisting=qry.getResultList();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return allexisting;
	}

}
