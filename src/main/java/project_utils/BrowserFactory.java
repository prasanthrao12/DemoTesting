package project_utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
		
 public WebDriver driver;
 
public void Open_Browser(String BrowserName)
{
	
	switch(BrowserName) {
	case "Chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		
	case "Firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	case "IE":
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		break;
	default:
		System.out.println("this is not good");

	}	
}



}
