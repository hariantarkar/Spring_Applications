package AnnotationCode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("emp")
public class employee {

	@Value("501")
	private int id;
	@Value("Ram")
	private String name;
	@Value("software developer")
	private String position;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
}
