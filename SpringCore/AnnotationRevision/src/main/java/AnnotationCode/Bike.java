package AnnotationCode;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("b")

public class Bike implements Vehicle{
	public void engine() {
		System.out.println("I am Bike class Output");
	}
	
}
