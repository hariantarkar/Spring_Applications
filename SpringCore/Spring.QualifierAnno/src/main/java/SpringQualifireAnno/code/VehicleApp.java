package SpringQualifireAnno.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VehicleApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context 
		= new AnnotationConfigApplicationContext(config.class);
		
		shop s=(shop)context.getBean("s");
		s.show();
		

	}

}
