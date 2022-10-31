package com.smart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.smart.dao.EmployeeRepository;
import com.smart.entites.Employee;

import java.util.*;

@Service
public class EmpService {
	
	@Autowired
	private EmployeeRepository repo;

	public void addEmp(Employee e) {
		repo.save(e);
	}
	
	public List<Employee> getAllEmp(){
		return repo.findAll();
	}
	
	public Employee getEmpById(int id) {
		Optional<Employee> e = repo.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}

	public void deleteEmp(int id) {
		repo.deleteById(id);;
	}
	
	public Page<Employee> getEMpByPaginate(int currentPage, int size) {
		Pageable p = PageRequest.of(currentPage, size);
		return repo.findAll(p);
	}
	
}
