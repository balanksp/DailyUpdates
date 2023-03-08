package com.springboot.Backend.Service.impl;

import org.springframework.stereotype.Service;

import com.springboot.Backend.Service1.EmployeeService;
import com.springboot.Backend.model.Employee;
import com.springboot.Backend.repository.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService {

	private EmployeeRepo employeerepository;
	
	
	
	public EmployeeServiceImp(EmployeeRepo employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}



	public Employee saveEmployee(Employee employee) {
		return employeerepository.save(employee);
	}

}
