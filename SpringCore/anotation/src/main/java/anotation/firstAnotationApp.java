package anotation;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class firstAnotationApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context 
		=new AnnotationConfigApplicationContext(config.class);
		
		/*
		 * student s=(student)context.getBean("std"); s.show();
		 */
		institue i=(institue)context.getBean("i");
		i.show();	
		
	}

}
