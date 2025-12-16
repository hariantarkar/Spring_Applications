package hari.BeanCode;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("T")
public class Test {

	@Value("505")
	private int id;
	@Value("ganesh")
	private  String name;
	@Value("3 hourse")
	private String duration;
	//use spring bean life cycle in xml 
	/*
	 * public Test() { System.out.println("I am Test class Contructor ..."); }
	 * 
	 * public int getId() { return id; } public void setId(int id) { this.id = id;
	 * 
	 * System.out.println("I am Dependancy injection called ...."); } public String
	 * getName() { return name; } public void setName(String name) { this.name =
	 * name; } public String getDuration() { return duration; } public void
	 * setDuration(String duration) { this.duration = duration; }
	 * 
	 * public void MyInit() { System.out.println("I am Init method .. "); }
	 * 
	 * public void MyDestroy() { System.out.println("I am destroy method called"); }
	 * public void show() {
	 * System.out.println("I am user define or utility method called "); }
	 */
	//use  spring bean life in annotation 

	
	public  Test() {
		System.out.println("I am Test class Contructor ...");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		
		System.out.println("I am Dependancy injection called ....");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String  duration) {
		this.duration = duration;
	}
	@PostConstruct
	public void MyInit() {
		System.out.println("I am Init method .. ");
	}
	@PreDestroy
	public void MyDestroy() {
		System.out.println("I am destroy method called");
	}
	public void show() {
		System.out.println("I am user define or utility method called ");
	}
	
	
}
