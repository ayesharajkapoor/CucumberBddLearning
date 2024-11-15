package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleDefinitions {
	WebDriver driver = new ChromeDriver();

	@Given("User is entering http:\\/\\/google.co in")
	public void user_is_entering_http_google_co_in() {
		// Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.driver.chrome", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

		driver.get("https://www.google.co.in/");

	}

	@When("User is typing the search term as {string}")
	public void user_is_typing_the_search_term_as(String string) {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.name("q")).sendKeys(string);

	}

	@When("User enters the return key")
	public void user_clicks_the_search_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("User should see the search results")
	public void user_should_see_the_search_results() {
		// Write code here that turns the phrase above into concrete actions
		WebElement ele = driver
				.findElement(By.partialLinkText("Chennai"));
		boolean status = ele.isDisplayed();
		if (status) {
			System.out.println("Result displayed");
		} else {
			System.out.println("Result is not displayed");
		}
	}

}
