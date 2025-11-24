package BeanLife.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerApp2 {

	public static void main(String[] args) {


//		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext("beanlife.xml");
		 ClassPathXmlApplicationContext context =
	                new ClassPathXmlApplicationContext("beanlife.xml");

		Player1 p1=(Player1)context.getBean("p");
		
		p1.show();
		
		context.close();
		
	}

}
