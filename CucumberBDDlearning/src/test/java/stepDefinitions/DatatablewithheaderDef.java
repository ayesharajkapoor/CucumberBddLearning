package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DatatablewithheaderDef {
	WebDriver driver;

	@Given("you should be on the login page of orangehrm url")
	public void you_should_be_on_the_login_page_of_orangehrm_url() throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}

	@When("you enters the valid credentials")
	public void you_enters_the_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<Map<String, String>> creden = dataTable.asMaps(String.class, String.class);
		String username = creden.get(0).get("UserName");
		String password = creden.get(0).get("Password");
		System.out.println(username);
		System.out.println(password);
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(password);

	}

	@When("User selects the login button")
	public void user_selects_the_login_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
