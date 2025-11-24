/*
 * package SpringQualifireAnno.code;
 * 
 * import org.springframework.context.annotation.Primary; import
 * org.springframework.stereotype.Component;
 * 
 * @Component("b") public class Bike implements Vehicle{
 * 
 * @Override public void engine() {
 * System.out.println("I am Bike class output"); }
 * 
 * }
 */

package SpringQualifireAnno.code;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("b")
@Primary
public class Bike implements Vehicle{

	@Override
	public void engine() {
		System.out.println("I am Bike class output");
	}

}
