package parallel;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	WebDriver driver;
	@Test(dataProvider = "dataProvider")
	public void login(String a, String b) {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(a);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(b);
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
	}

	@DataProvider
	public Object[][] dataProvider() {
		Object[][] data = new Object[3][2] ;
		data[0][0] = "student"; 
		data[0][1] = "Password123";

		return data;

	}

}
