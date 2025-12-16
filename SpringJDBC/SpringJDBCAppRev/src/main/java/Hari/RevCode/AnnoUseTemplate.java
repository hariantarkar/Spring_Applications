package Hari.RevCode;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AnnoUseTemplate {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("jdbcTemplateUse.xml");
		
		JdbcTemplate template=(JdbcTemplate)context.getBean("template");
		
		if(template !=null) {
			System.out.println("Data base is connected");
		}
		else
		{
			System.out.print("data base is not connect");
		}
	}

}
