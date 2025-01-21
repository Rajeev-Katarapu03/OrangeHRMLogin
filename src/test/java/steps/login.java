package steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
	
	@Given("user starts chrome browser")
	public void user_starts_browser() {
		 driver=new ChromeDriver();
		
	}
	@And("user launch app using url {string}")
	public void user_launch_app(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@And("user enters text {string} in textbox using xpath {string}")
	public void user_enters_text(String text, String xpath) {
		WebElement txt=driver.findElement(By.xpath(xpath));
		txt.sendKeys(text);
	}
	@When("user clicks login button using xpath {string}")
	public void user_clicks_login(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	@Then("user verifies title to be {string}")
	public void user_verifies_title(String expTitle) throws InterruptedException {
		Assert.assertEquals(expTitle, driver.getTitle());
		Thread.sleep(30);
		driver.quit();
	}
	
}

