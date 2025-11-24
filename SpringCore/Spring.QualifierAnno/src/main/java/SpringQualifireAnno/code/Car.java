package SpringQualifireAnno.code;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("c")
public class Car implements Vehicle{

	@Override
	public void engine() {
		System.out.println("I am car class output");
	}

	
}
