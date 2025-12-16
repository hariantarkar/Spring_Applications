package BeanCode;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("proto1")
@Scope("prototype")
public class PrototypewithAnno {

	public PrototypewithAnno() {
		System.out.println("\n I am Proptotype bean scope test class contructor using annotation---------");
	}
	
}
