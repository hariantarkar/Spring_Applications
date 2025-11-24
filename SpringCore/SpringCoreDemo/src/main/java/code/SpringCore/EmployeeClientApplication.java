package code.SpringCore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClientApplication {

	public static void main(String[] args) {
		 ApplicationContext context =
					new ClassPathXmlApplicationContext("test.xml");
			

		 company c=(company )context.getBean("c"); 
		 c.show();
		 


	}

}
