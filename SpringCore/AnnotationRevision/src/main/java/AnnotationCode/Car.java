package AnnotationCode;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("c")
@Primary
public class Car implements Vehicle{

	public void engine() {
		System.out.println("I am car class output");
	}
}
