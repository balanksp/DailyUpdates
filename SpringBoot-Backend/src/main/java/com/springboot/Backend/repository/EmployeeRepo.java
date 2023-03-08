package com.springboot.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Backend.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
