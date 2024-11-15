package stepDefinitions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DatatablewithoutheaderDef {
	WebDriver driver;

	@Given("User is on the login page of orangehrm url")
	public void user_is_on_the_login_page_of_orangehrm_url() throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}

	@When("User enters the valid credentials")
	public void user_enters_the_valid_credentials(DataTable dt) {
		
		List<String> credentials =dt.row(0);
		

		String userName= credentials.get(0);
		String password = credentials.get(1);
		System.out.println(userName);
		System.out.println(password);
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(password);
	}

	@When("User click the login button after entered the credentials")
	public void user_click_the_login_button_after_entered_the_credentials() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
