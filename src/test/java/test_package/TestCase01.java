package test_package;


import org.testng.Reporter;
import org.testng.annotations.Test;

import project_Pages.HomePages;
import project_Pages.Loginpage;



public class TestCase01 extends TestBase{

	


	@Test(priority=0)
	public void Test01() 
	{
		Loginpage Login=new Loginpage(driver);
		Login.LoginTest("Admin","admin123");
		
	}
	
	@Test(priority=1)
	public void Test02() {
		
		Loginpage Login=new Loginpage(driver);
		Login.LoginTest("Admin","admin123");
		
		HomePages Home=new HomePages(driver);
		Home.click_on_usernamelabel();
		Home.click_on_LogOut_Button();
		
		
	}

	
	
}

