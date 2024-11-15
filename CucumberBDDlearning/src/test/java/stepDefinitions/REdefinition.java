package stepDefinitions;

import io.cucumber.java.en.Given;

public class REdefinition {
	@Given("^I have (\\d+) laptop$") 
	public void I_have_laptop(int count) {
		System.out.println("Laptop count is : " +count);
	}
	@Given("^I have a (\\d+\\.\\d+) CGPA$")
		public void I_have_a_CGPA(float num) {
		System.out.println("CGPA is :" +num);
	}
	@Given("{string} is elder than {string} and {string}")
	public void is_elder_than_and(String string1, String string2, String string3) {
		System.out.println(string1 + "is elder than " +string2 +"and" +string3);
	}
	
	

}
