package project_Pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	
	
	WebDriver driver;
	public homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(name="username") WebElement Username;
	
	public void Send_username(String username) {
	
  	   // driver.findElement(By.name("username")).sendKeys(username);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Username.sendKeys(username);
		
	}
	
}
