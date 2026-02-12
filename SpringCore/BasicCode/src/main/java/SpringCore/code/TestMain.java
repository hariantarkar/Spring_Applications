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
		
		
		Student std=(Student)context.getBean("std");
		std.show();
		
		
		
		
		}

	
}
