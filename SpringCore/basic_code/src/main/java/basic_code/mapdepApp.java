package basic_code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mapdepApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context =new ClassPathXmlApplicationContext("schoolMapDep.xml");
		
		SchoolMapDep s=(SchoolMapDep)context.getBean("s");
		s.show();
		
	}

}
