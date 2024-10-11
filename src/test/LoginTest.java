package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	WebDriver driver;

	@Test
	public void loginMethod() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Password123");
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
		WebElement successMessage = driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
		successMessage.isDisplayed();
		System.out.println("Login success message: "+successMessage.getText());
	}
	
	@Test
	public void loginWrongPass() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("6rtf5f");
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
		WebElement successMessage = driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
		successMessage.isDisplayed();
		System.out.println("Login success message: "+successMessage.getText());
	}
	
	@Test
	public void loginWrongUser() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("uy7r6t");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Password123");
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
		WebElement successMessage = driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
		successMessage.isDisplayed();
		System.out.println("Login success message: "+successMessage.getText());
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
