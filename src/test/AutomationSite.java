package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class AutomationSite {
	WebDriver driver;
	
	@Test (priority = 1)
	public void loginTest() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Password123");

		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
	}

	@Test (priority = 2)
	public void dashboardTest() {
		
		WebElement logoutButton = driver.findElement(By.linkText("Log out"));
		logoutButton.click();
		
	}

	@BeforeTest
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void afterClass() {
		driver.quit();


	}

}
