package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_StepDef {
	
	@Given("Thanos has infinity stones")
	public void thanos_has_infinity_stones() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Thanos has infinity stone");
	}
	@When("Thanos snap his fingers")
	public void thanos_snap_his_fingers() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Thanos snap his fingers");
	}
	@Then("half of the living things died")
	public void half_of_the_living_things_died() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("half of the living things died");
	}




}
