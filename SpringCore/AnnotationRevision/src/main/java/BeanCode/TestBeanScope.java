package BeanCode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScope {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("testBeane.xml");
	
	//ApplicationContext context1 =new ClassPathXmlApplicationContext("testBeane.xml");
	//use singleton scope with xml
	TestCode t1=(TestCode)context.getBean("t1");
	
	TestCode t2=(TestCode)context.getBean("t1");
	
	//use prototype scope with xml
	PrototypeTest p=(PrototypeTest)context.getBean("p1");
	PrototypeTest p1=(PrototypeTest)context.getBean("p1");
	PrototypeTest p2=(PrototypeTest)context.getBean("p1");
	
	ApplicationContext cxt=new AnnotationConfigApplicationContext(ConfigWithAnno.class);
	
	//use prototype  scope with annotation 
	PrototypewithAnno PA=(PrototypewithAnno)cxt.getBean("proto1");

	PrototypewithAnno PA1=(PrototypewithAnno)cxt.getBean("proto1");


	
	}

}
