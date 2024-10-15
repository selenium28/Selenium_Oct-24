package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parametrizationn {
	WebDriver driver;
	String browser = "firefox";
	
	@Test 
	public void param(String param) {
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			
		}{
			driver = new FirefoxDriver();
		}
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
	}

}
