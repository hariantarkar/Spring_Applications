package Bean_life_cycle.code;

public class Player {
	
	private int id;
	private String name;
	private int run;
	
	

	Player()
	{
		System.out.println(" I am Bean Instantiation");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("dependance injection");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
	
	public void myInit() {
		System.out.println("I am custom init method");
		
	}
	
	public void myDestroy() {
		System.out.println("i am custom destroy method ");
	}
	
	public void show() {
		System.out.println("i am user mehtod");
		
	}
	

}
