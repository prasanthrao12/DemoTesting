package test_package;


import org.testng.Reporter;
import org.testng.annotations.Test;

import project_Pages.Loginpage;



public class TestCase01 extends TestBase{

	


	@Test
	public void Test01() 
	{
		driver.getTitle();
		System.out.println(driver.getTitle());
		Loginpage Login=new Loginpage(driver);
		
		Login.Send_username("Admin");
		Reporter.log("===User Entered Username===",true);
		
		Login.Send_Password("admin123");
		Reporter.log("===User Entered password===",true);
		
		Login.Click_On_LoginButton();
		Reporter.log("===User clicked login button===",true);
		
	}

	
	
}

