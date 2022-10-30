package project_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class HomePages {

	

		WebDriver driver;
		public HomePages (WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		/*
		 *  Home Page Object Repository
		 */
		@FindBy(xpath="//span/p[text()='abcde Collings']") WebElement Usernamelabel;
		@FindBy(xpath="//li/a[text()='Logout']") WebElement LogOut_Button;
	 
			
		/*
		 * Methods By Prasanth
		 */
		public void click_on_usernamelabel() {
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		  	wait.until(ExpectedConditions.elementToBeClickable(Usernamelabel)).click();
		  	Reporter.log("===User clicked on the username label===",true);
		  	
		  	
		}
		
		
		public void click_on_LogOut_Button() {
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		  	wait.until(ExpectedConditions.elementToBeClickable(LogOut_Button)).click();
			
			Reporter.log("===User clicked on the LogOut Button ===",true);
			
		}
		
}
