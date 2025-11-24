package anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("i")
public class institue {

	@Autowired
	student std;
	public void setStudent(student std)
	{
		this.std=std;
	}
	public void show()
	{
		 System.out.println("Id \t Name \t Batch");
		System.out.println(std.getId()+"\t"+std.getName()+"\t"+std.getBatch());
		
	}
		
}
