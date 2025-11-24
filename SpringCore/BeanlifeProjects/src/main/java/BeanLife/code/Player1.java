package BeanLife.code;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("p")

public class Player1 {

	private int id;
	@Value("ram")
	private String name;
	private int run;
	
	Player1(){
		System.out.println("Bean Instantiation");
	}

	public int getId() {
		return id;
	}
	@Value("1")
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
@Value("20")
	public void setRun(int run) {
		this.run = run;
	}
	@PostConstruct
	public void myInit() {
		System.out.println("I am custom init method.....");
	}
	@PreDestroy

	public void myDestroy() {
		System.out.println("i am destroy method---- ");
	}
	
	public void show() {
		System.out.println("i am user define method++++");
		
	}
	
	
}
