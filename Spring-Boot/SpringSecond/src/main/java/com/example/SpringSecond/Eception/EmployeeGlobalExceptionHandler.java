package com.example.SpringSecond.Eception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeGlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<EmployeeErorrModel> handleException(EmployeeNotFoundException ex){
		EmployeeErorrModel model=new EmployeeErorrModel(HttpStatus.NOT_FOUND.value(), ex.getMessage());
		
		
		return new ResponseEntity<>(model,HttpStatus.NOT_FOUND);
		
		
	}
}
