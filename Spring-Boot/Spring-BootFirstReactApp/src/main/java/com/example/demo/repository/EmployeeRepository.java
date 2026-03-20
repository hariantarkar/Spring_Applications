package com.example.demo.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.*;
@Repository("empRepo")
public class EmployeeRepository {

	
	JdbcTemplate template;
	
	public boolean isSave(Employee employee) {
		int value=template.update("insert into employee values ('0',?,?",
				new Object[] {employee.getName(),employee.getSal()});
			return value>0?true:false;
		}
}
