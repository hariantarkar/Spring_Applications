package AnnotationCode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.*;
@Configuration
@ComponentScan(basePackages  = {"AnnotationCode"})
public class Config {
	@Bean(name="d")
	public Date getDate() {
		
		return new Date();
	}

}
