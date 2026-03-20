package com.example.SpringSecond.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.SpringSecond.Eception.EmployeeNotFoundException;
import com.example.SpringSecond.model.EmployeeModel;
import com.example.SpringSecond.repository.EmployeeRepository;


@Service("empService")
public class EmployeeService {
	@Autowired
	EmployeeRepository EmpRepo;
	
	public boolean isSave(EmployeeModel employee) {
		return EmpRepo.isSave(employee);
		
		
	}
	public List <EmployeeModel> getAllEmployees(){
		return EmpRepo.getAllEmployees();
	}
	
	public EmployeeModel getEmployeeById(int empid) {
		return EmpRepo.getEmployeeById(empid);
		
	}
	public EmployeeModel UpdateEmployeeById(int empid,EmployeeModel emp) {
		EmployeeModel empResult=EmpRepo.UpdateEmployee(empid, emp);
		if(empResult!=null) {
			return emp;
		}
		throw new EmployeeNotFoundException("employee not found using this id..."+empid);
		
	}
	public boolean isDelete(int empid) {
		boolean result=EmpRepo.isDelete(empid);
		return result;
		
	}
	public Page<EmployeeModel> findAll(int page,int size) {
		Pageable pageable=PageRequest.of(page, size);
		return EmpRepo.findAll(pageable);
		
		
	}
	
}






