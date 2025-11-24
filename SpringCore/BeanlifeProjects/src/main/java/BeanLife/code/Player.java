package BeanLife.code;

public class Player {

	private int id;
	private String name;
	private int run;
	
	Player(){
		System.out.println("Bean Instantiation");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Dependance injection ");
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
		System.out.println("i am destroy method ");
	}
	
	public void show() {
		System.out.println("i am user define method");
		
	}
	
	
}
