package steps;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class pim {
	WebDriver driver;
	@Given("user logged in as admin")
    public void user_logged_as_admin() throws InterruptedException{
		driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();
        Thread.sleep(3000);
    }

    @When("user clicks on pim button using xpath {string}")
    public void i_navigate_to_the_module(String xpath) throws InterruptedException {
        WebElement pimMenu = driver.findElement(By.xpath(xpath));
        pimMenu.click();
        Thread.sleep(3000);
    }
    @And("user clicks on Add Employee button using xpath {string}")
    public void user_clicks_add_employee(String xpath) throws InterruptedException {
     WebElement	AddButton=driver.findElement(By.xpath(xpath));
     AddButton.click();
     Thread.sleep(3000);
    }
    @When("user enters firstname {string} in textbox using xpath {string}")
    	public void user_enter_firstname(String text,String xpath) throws InterruptedException {
    		WebElement fName= driver.findElement(By.xpath(xpath));
    		fName.sendKeys(text);
    		Thread.sleep(3000);
    	}
    @When("user enters Lastname {string} in textbox using xpath {string}")
	public void enter_LastName(String text,String xpath) throws InterruptedException {
		WebElement LName= driver.findElement(By.xpath(xpath));
		LName.sendKeys(text);
		Thread.sleep(3000);
	}
    @When("user clicks on save button using xpath {string}")
    public void clicks_save_button(String xpath) {
    	WebElement save=driver.findElement(By.xpath(xpath));
    	save.click();
    	driver.quit();
    }
    
    }

    

    

