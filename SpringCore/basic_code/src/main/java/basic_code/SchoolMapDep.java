package basic_code;
import java.util.*;

public class SchoolMapDep {
	private Map<Integer ,String>names;
	public void setNames(Map<Integer ,String>names)
	{
		this.names=names;
	}
	public void show()
	{
		Set<Map.Entry<Integer,String >> set=names.entrySet();
		for(Map.Entry<Integer,String> m:set)
		{
			System.out.println("key is -->  "+m.getKey()+"  value is --> "+m.getValue());
		}
		
		
		
	}
}
