package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class backgroundHooks {
	
	@Before()
	public void beforebgscenario() {
		System.out.println("This will run before every scenario "); 
		
	}
	@After()
	public void afterbgscenario() {
		System.out.println("This will run after every scenario "); 
		
	} 

}
