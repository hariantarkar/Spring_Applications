package Spring.Bean.Code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class singletonProject {

	private static final String PrototyeScope = null;

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("Singletonscope.xml");
		
		/*
		 * SingletonScope s1=(SingletonScope)context.getBean("s");
		 * 
		 * SingletonScope s2=(SingletonScope)context.getBean("s");
		 * 
		 * SingletonScope s3=(SingletonScope)context.getBean("s");
		 * 
		 */
		ClassPathXmlApplicationContext context 
		    =new ClassPathXmlApplicationContext("Prototypescope.xml");
		
		PrototyeScope p=(PrototyeScope)context.getBean("p");
		
		PrototyeScope p1=(PrototyeScope)context.getBean("p");
		
		PrototyeScope p2=(PrototyeScope)context.getBean("p");
		
		PrototyeScope p3=(PrototyeScope)context.getBean("p");

		
	
	}

}
