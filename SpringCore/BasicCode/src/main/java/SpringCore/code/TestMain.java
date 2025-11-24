package SpringCore.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		 ApplicationContext context=
					new ClassPathXmlApplicationContext("test.xml");
						
		Object obj=context.getBean("e");
		
		Employee e=(Employee)obj;
		e.show();
		
		
		}

}
