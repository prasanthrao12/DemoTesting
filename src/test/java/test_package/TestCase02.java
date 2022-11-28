package test_package;

import org.testng.annotations.Test;

import project_Pages.Loginpage;

public class TestCase02 extends TestBase {
	
	
@Test
public static void retesting_Login() {
	Loginpage Login=new Loginpage(driver);
	Login.LoginTest("Admin","admin123");
}


}
