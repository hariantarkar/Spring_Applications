package basic_code;
import java.util.*;
public class School {

	
	private List <String> names;
	public void setNames(List<String> names)
	{
		this.names=names;
	}
	public void show()
	{
		System.out.println("Names List");
		
		for(String n:names)
		{
			System.out.println(n);
			
		}
	}
}
