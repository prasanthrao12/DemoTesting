package test_package;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import project_Pages.homepage;

public class TestCase01 extends TestBase{

	


	@Test
	public void Test01() 
	{
		driver.getTitle();
		System.out.println(driver.getTitle());
		homepage home=new homepage(driver);
		
		home.Send_username("Admin");
		Reporter.log("===User Entered Username===");
		
		home.Send_Password("admin123");
		Reporter.log("===User Entered password===");
		
		home.Click_On_LoginButton();
		Reporter.log("===User clicked login button===");
		
	}

	
	
}

