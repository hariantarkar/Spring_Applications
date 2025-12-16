package SpringCore.code;
import java.util.*;
import java.util.Map;
public class school {

	//Collection dependency 
//	private List <String> names;
//	public void setNames(List<String> names) {
//		this.names=names;
//	}
//	public void show() {
//		for(String s:names)
//		{
//			System.out.println("Value is : "+s);
//		}
//	}
	
	//map dependency
	private Map <Integer,String>names;
	public void setNames(Map<Integer,String>names) {
		this.names=names;
	}
	public void show() {
		
		Set<Map.Entry<Integer,String>>set=names.entrySet();
		for(Map.Entry<Integer, String> m:set)
		{
			System.out.println(m.getKey()+" <------------>"+m.getValue());
		}
	}
	
	
	
}
