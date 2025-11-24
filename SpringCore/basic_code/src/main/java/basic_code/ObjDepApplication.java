package basic_code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjDepApplication {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("testcode.xml");
		
		School s=(School)context.getBean("s");
		s.show();
		

	}

}
