package Hari.RevCode;

import java.sql.DriverManager;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class AnnoationRev {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(ConfigTest.class);
		
		DriverManagerDataSource dataSource=(DriverManagerDataSource)context.getBean("dataSource");
		
		if(dataSource !=null) {
			
			System.out.println("Data base is connected");
		}
		else {
			System.out.println("Data base is not connect");
		}
		
		
		
		
		
		
	}

}
