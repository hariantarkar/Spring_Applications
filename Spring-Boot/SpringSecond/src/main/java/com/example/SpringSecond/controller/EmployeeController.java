package com.example.SpringSecond.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringSecond.Eception.EmployeeNotFoundException;
import com.example.SpringSecond.model.EmployeeModel;
import com.example.SpringSecond.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	

	@Autowired 
	EmployeeService empService;
 	
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody EmployeeModel employee ) {
		boolean b=empService.isSave(employee);
		if(b) {	
		return "Employee added successfully....";
		}
		else {
			return "Employee does not add....";
		}
	}
	
	@GetMapping("/ViewAllEmployee")
	public List<EmployeeModel>getAllEmployees(){
	return empService.getAllEmployees();
		
	}
	@GetMapping("/EmployeeSearchById/{id}")
	public EmployeeModel SearchById(@PathVariable("id")int id) {
		EmployeeModel emp=empService.getEmployeeById(id);
		if(emp!=null) {
		return emp;
		}
		throw new EmployeeNotFoundException("employee not found using this id.."+id);
		
	}
	@PutMapping("/updateById/{id}")
	public EmployeeModel UpdateById(@PathVariable("id")int id ,@RequestBody EmployeeModel employee) {
		EmployeeModel emp=empService.UpdateEmployeeById(id, employee);
		
		return emp;
		
	}
	@DeleteMapping("/deleteById/{id}")
	public boolean DeleteById(@PathVariable("id")int id) {
		boolean emp=empService.isDelete(id);
		
		if(emp!=false) {
			return emp;
			}
			throw new EmployeeNotFoundException("employee does not delete and found using this id.."+id);
			
		
		
	}
	@GetMapping("/fetchByPage/{pagenum}/{pagesize}")
	public Page<EmployeeModel> FetchByPage(@PathVariable("pagenum")Integer pagenum ,@PathVariable("pagesize")int pagesize) {
		Page<EmployeeModel>pages=(Page<EmployeeModel>) empService.findAll(pagenum,pagesize);
		
		return pages;
		
		
	}

}
