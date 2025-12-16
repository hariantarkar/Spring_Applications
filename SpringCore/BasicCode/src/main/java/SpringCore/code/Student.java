package SpringCore.code;

public class Student {

	private int id;
	private String name;
	private String SirName;
	public Student(int id, String name, String sirName) {
		super();
		this.id = id;
		this.name = name;
		SirName = sirName;
	}
	public void show() {
		System.out.println("id is : "+id+"\n name is : "+name+"\n sir name : " +SirName);
	}
	
}
