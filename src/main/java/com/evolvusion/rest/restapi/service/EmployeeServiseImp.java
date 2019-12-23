package com.evolvusion.rest.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.evolvusion.rest.restapi.bean.Employee;
import com.evolvusion.rest.restapi.idao.IEmployeeDao;
import com.evolvusion.rest.restapi.repository.EmployeeRepository;

@Service
public class EmployeeServiseImp implements EmployeeServise {
	
	@Autowired
	private IEmployeeDao iemployeeDao; 

	@Transactional
	public List<Employee> findAll() {

		return  iemployeeDao.findAll();
	}

	@Transactional
	public String addAll(Employee emp) {
		
		/*
		 * Employee emp1= new Employee();
		 * 
		 * emp1.setlName(emp.getlName()); emp1.setFname(emp.getFname());
		 * emp1.setAdress(emp.getAdress());
		 */
		
		
		String msg=null;
		try {
			iemployeeDao.save(emp);
		msg="SUCCESS";
		}catch (Exception e) {
			msg="failure";
			e.printStackTrace();
		}
		
		return msg;
	}

	/*
	 * public IEmployeeDao getiemployeeDao() { return iemployeeDao; }
	 * 
	 * public void setiemployeeDao(IEmployeeDao iemployeeDao) { this.iemployeeDao =
	 * iemployeeDao; }
	 */

	@Transactional
	public Optional<Employee> getById(Long id) {
		return iemployeeDao.getById(id);
		 
	}

	@Override
	public List<Employee> getAllByJdbc() {
		// TODO Auto-generated method stub
		return null;
	}

}
