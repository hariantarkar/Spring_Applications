package hari.BeanCode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		//use xml 
		//ApplicationContext context =new ClassPathXmlApplicationContext("blife.xml");
	
		//Test t=(Test)context.getBean("t");
		//t.show();
		
		//((AbstractApplicationContext) context).close();
	
		//use annotation 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		Test t=(Test)context.getBean("T");
		t.show();
		
		context.close();
		
		
		
	}
	
}
