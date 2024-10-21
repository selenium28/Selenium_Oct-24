package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataP {
  @Test
  public void first() {
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
//		1. Locators - ID
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
//		2. Name
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Password123");
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
		WebElement successMessage = driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
		successMessage.isDisplayed();
		System.out.println("Login success message: "+successMessage.getText());
		
		driver.close();
  }
}
