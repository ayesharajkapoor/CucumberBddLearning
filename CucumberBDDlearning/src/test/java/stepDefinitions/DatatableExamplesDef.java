package stepDefinitions;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DatatableExamplesDef {
	WebDriver driver;

	@Given("User should be on the login page of orangehrm url")
	public void user_should_be_on_the_login_page_of_orangehrm_url() throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}

	@When("User must enter the valid credentials username as {string} and password as {string}")
	public void user_must_enter_the_valid_credentials_username_as_and_password_as(String username, String password) {
		
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(password);
	}

	@When("User clicks the login button after provided credentials")
	public void user_clicks_the_login_button_after_provided_credentials() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
