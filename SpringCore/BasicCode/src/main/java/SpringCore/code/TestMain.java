package SpringCore.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		 ApplicationContext context=
					new ClassPathXmlApplicationContext("test.xml");
						
		Object obj=context.getBean("employee");
		
		Employee e=(Employee)obj;
		
		ContructorTest t=(ContructorTest)context.getBean("t");
		
//		Company c=(Company)context.getBean("c");
//		c.show();
		
		//Collection dependency 
		/*
		 * school s=(school)context.getBean("s"); s.show();
		 */
		
		//map dependency
		/*
		 * school s1=(school)context.getBean("s1"); s1.show();
		 */
		
		Student std=(Student)context.getBean("std");
		std.show();
		
		
		
		
		}

	
}
