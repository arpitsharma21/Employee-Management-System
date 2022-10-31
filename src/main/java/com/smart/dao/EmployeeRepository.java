package com.smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.entites.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
