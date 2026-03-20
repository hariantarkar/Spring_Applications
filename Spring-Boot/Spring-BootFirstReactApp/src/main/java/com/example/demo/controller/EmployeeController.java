package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired 
	EmployeeService empService;
	
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee employee ) {
		boolean b=empService.isSave(employee);
		if(b) {	
		return "Employee added successfully....";
		}
		else {
			return "Employee does not add....";
		}
	}
	
	@GetMapping("/ViewAllEmployee")
	public List<Employee>getAll(){
		return null;
		
	}
	@GetMapping("/EmployeeSearchById/{id}")
	public Employee SearchById(@PathVariable("id")int id) {
		return null;
		
	}
	@PutMapping("/updateById/{id}")
	public Employee UpdateById(@PathVariable("id")int id ,@RequestBody Employee employee) {
		return null;
		
	}
	@DeleteMapping("/deleteById/{id}")
	public Employee DeleteById(@PathVariable("id")int id) {
		return null;
		
	}
	@GetMapping("/FetchByPage/{pageNum}/{pageSize}")
	public Employee FetchByPage(@PathVariable("pageNum")int id ,@PathVariable("pageSize")int pageSize) {
		
		return null;
		
	}

	
}
