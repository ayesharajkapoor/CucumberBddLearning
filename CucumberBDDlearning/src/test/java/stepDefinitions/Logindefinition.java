package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Logindefinition {
	WebDriver driver;
	@Given("^User is on the login page of the orangehrm site$")
	public void  User_is_on_the_login_page_of_the_orangehrm_site() throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		 driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	}
	@When("User enters the valid username and password")
	public void user_enters_the_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
	}
	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    
	}
	@Then("User should be navigated to the home page")
	public void user_should_be_navigated_to_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("//*[@class=\"oxd-brand-banner\"]")).isDisplayed();
		if(status) {
			System.out.println("Home page is displayed");
		}
	
	}

}
