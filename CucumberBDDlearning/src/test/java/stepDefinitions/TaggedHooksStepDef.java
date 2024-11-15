package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooksStepDef {

	@Given("This is the first step")
	public void this_is_the_first_step() {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("This is the first step");
	}
	@When("This is the second step")
	public void this_is_the_second_step() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("This is the second step");
	}
	@Then("This is the third step")
	public void this_is_the_third_step() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("This is the third step");
	}
}
