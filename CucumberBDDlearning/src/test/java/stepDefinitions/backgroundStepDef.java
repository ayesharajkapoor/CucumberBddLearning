package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class backgroundStepDef {
	
	@Given("Student should be passed in high school")
	public void student_should_be_passed_in_high_school() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Student should be passed in high school");
	}
	@Given("Student should be passed in higher secondary")
	public void student_should_be_passed_in_higher_secondary() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Student should be passed in higher secondary");
	}

	@Given("The student applied for medical course")
	public void the_student_applied_for_medical_course() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("The student applied for medical course");
	}

	@When("The student shouldbe passed in entrance exam")
	public void the_student_shouldbe_passed_in_entrance_exam() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("The student shouldbe passed in entrance exam");
	}

	@Then("The student is eligible for joining medical  institute")
	public void the_student_is_eligible_for_joining_medical_institute() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("The student is eligible for joining medical  institute");
	}

	@Given("The student should be applied for engineering course")
	public void the_student_should_be_applied_for_engineering_course() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("The student should be applied for engineering course");
	}

	@When("The student should be sayable cutoff")
	public void the_student_should_be_sayable_cutoff() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("The student should be sayable cutoff");
	}

	@Then("The student is eligible for joining engineering institue")
	public void the_student_is_eligible_for_joining_engineering_institue() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("The student is eligible for joining engineering institue");
	}

}
