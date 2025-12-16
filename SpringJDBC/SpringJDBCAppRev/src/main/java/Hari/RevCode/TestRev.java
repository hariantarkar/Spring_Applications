package Hari.RevCode;

import java.sql.DriverManager;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestRev {

	public static void main(String[] args) {
		
		DriverManagerDataSource datasource =new DriverManagerDataSource();
		
		datasource.setUsername("root");
		datasource.setPassword("root");
		datasource.setUrl("jdbc:mysql://localhost:3307/jdbcapp");
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		if(datasource!=null) {
			System.out.println("database is connected");
		}
		else
		{
			System.out.println("database is not connect");

		}
	}

}
