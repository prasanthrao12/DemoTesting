package test_package;

import org.openqa.selenium.WebDriver;
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
		System.out.println("user value entered successfully");
	}

	
	
}

