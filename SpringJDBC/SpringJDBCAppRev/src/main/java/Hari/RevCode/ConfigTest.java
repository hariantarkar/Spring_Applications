package Hari.RevCode;

import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"Hari.RevCode"})
public class ConfigTest {

	@Bean("dataSource")
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource dataSource =new DriverManagerDataSource();
		
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setUrl("jdbc:mysql://localhost:3307/jdbcapp");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		
		return dataSource;
		
		
		
	}

	

}
