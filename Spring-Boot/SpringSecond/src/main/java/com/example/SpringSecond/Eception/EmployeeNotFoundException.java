package com.example.SpringSecond.Eception;

public class EmployeeNotFoundException extends RuntimeException{
	
	private String message;
	public EmployeeNotFoundException(String message) {
		super(message);
		
	}
}
