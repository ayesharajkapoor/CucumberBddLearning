package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RecievingDataasRE {
	WebDriver driver;
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		 driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	@When("User enters the valid credentials {string} and {string}")
	public void user_enters_the_valid_and(String username, String password) {
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(password);
	}
	@When("User click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}



}
