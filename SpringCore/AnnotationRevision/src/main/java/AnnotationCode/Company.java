package AnnotationCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component("com")
public class Company {

	/*
	 * @Value("TCS") private String Name;
	 * 
	 * @Value("Pune") private String location; public String getName() { return
	 * Name; } public void setName(String name) { Name = name; } public String
	 * getLocation() { return location; } public void setLocation(String location) {
	 * this.location = location; }
	 */
	
	
	/*
	 * public void show() {
	 * System.out.println("Company Name : "+Name+"\n Company Location : "+location);
	 * 
	 * }
	 */
	@Autowired
	employee emp;
	public void setemployee(employee emp) {
		this.emp=emp;
	}
	
	public void show() {
		System.out.println("Employee Id : "+emp.getId()+"\n Employee Name : "+emp.getName()+"\n Employee Position Is : "+emp.getPosition());
	}
	
	
	
}






