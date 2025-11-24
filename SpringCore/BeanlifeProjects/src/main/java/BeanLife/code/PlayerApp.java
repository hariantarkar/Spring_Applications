package BeanLife.code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlife.xml");
		

		Player p = (Player) context.getBean("player"); // bean instance+ dependency injection

		p.show();
		context.close();
		
		
	}

}