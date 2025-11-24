package org.techhub;
import org.springframework.jdbc.datasource.*;
public class TestDatabaseConect {

	public static void main(String[] args) {
		
		DriverManagerDataSource dataSourse = new DriverManagerDataSource();
		dataSourse.setUsername("root");
		dataSourse.setPassword("root");
		dataSourse.setUrl("jdbc:mysql://localhost:3307/nodeproject ");
		dataSourse.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		if(dataSourse!=null)
		{
			System.out.println("data base is conected");
		}
		else
		{
			System.out.println("data base is not connected");
			
			
		}
	}

}
