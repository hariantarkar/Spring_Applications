package hari.annotation.code;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class objectwithDate {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext context 
		=new AnnotationConfigApplicationContext(Config.class);
		
		Date d=(Date)context.getBean("d");
		System.out.println( d);

	}

}
