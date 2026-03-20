package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.model.*;
@Service("empService")
public class EmployeeService {

	
	@Autowired
	EmployeeRepository EmpRepo;
	
	public boolean isSave(Employee employee) {
		return EmpRepo.isSave(employee);
		
	}
	
}
