package AnnotationCode;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnootationMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context  =new AnnotationConfigApplicationContext(Config.class);
		
	
		Date d=(Date)context.getBean("d");
		System.out.println("Date Is :"+d);
		
//		Company c=(Company)context.getBean("com");
//		c.show();
//		
		Shop s=(Shop)context.getBean("s");
		s.show();
		
		
		
		
		
	}

}
