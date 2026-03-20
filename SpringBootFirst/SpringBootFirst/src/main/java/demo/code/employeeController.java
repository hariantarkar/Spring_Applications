package demo.code;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {

	ArrayList<employee> al=new ArrayList<employee>();
	
	@PostMapping("/save")
	public String save(@RequestBody employee emp) {
		boolean b=al.add(emp);
		if(b) {
			return "employee added successfully";
		}
		else {
			return "employee is not added.....";
		}
		
	}
	@GetMapping("/fetchemp")
	ArrayList<employee>getAllEmployees(){
		return al;
		
	}
	@GetMapping("/searchemp/{n}")
	public employee empbyname(@PathVariable("n")String n) {
	
		employee  emp=null;
		for(employee e:al) {
			if(e.getName().equals(n)) {
				emp=e;
			}
		}
		return emp;
		
	}
	
	
	@DeleteMapping("/deleteemployee/{n}")
	public String DelEmpByName(@PathVariable("n") String n) {
		
		Iterator<employee>ite=al.iterator(); 
		
		while(ite.hasNext()) {
			employee e=ite.next();
			if(e.getName().equals(n)) {
				ite.remove();
				return "employee deleted successfully";
			}
			
		}
		return "employee not found to delete...";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
