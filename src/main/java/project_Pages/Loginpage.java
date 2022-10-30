package project_Pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Loginpage {

	
	
     WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Object Repository
	@FindBy(name="username")
	 WebElement Username;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement Login_Button;
	
	public  void Send_username(String username) {
	
  	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
  	   wait.until(ExpectedConditions.visibilityOf(Username)).sendKeys(username);
  	   
  	   Reporter.log("===User Entered Username===",true);
	}
	
	public   void Send_Password(String password) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	  	wait.until(ExpectedConditions.visibilityOf(Password)).sendKeys(password);
	  	
	  	Reporter.log("===User Entered password===",true); 	
	}
	public  void Click_On_LoginButton() {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	  	wait.until(ExpectedConditions.elementToBeClickable(Login_Button)).click();
		
	  	Reporter.log("===User clicked login button===",true);
	}
	public  void getTitle_Myapplication() {
		
	    String	Title=driver.getTitle();
		System.out.println(Title);
	}
	
	
	public  void LoginTest(String username,String password) {
		Username.sendKeys(username);
		Password.sendKeys(password);
		Login_Button.click();
		Reporter.log("===user LoginTest completed success===",true);
	}
	
}
