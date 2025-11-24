package anotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class student {
	
	@Value("1")
	private int id;
	@Value("shyam")
	private String name;
	@Value("oct")
	private String batch;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	/*
	 * public void show() { System.out.println("Id \t Name \t Batch");
	 * System.out.println(id+"\t"+name+"\t"+batch);
	 * 
	 * }
	 */
}
