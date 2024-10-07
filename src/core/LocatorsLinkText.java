package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
//		Selenium Waits 
//		1. Implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		2. Explicit Wait - Dynamic Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flights")));
		
		driver.findElement(By.linkText("Flights")).click();
		
		WebElement FlightDetail = driver.findElement(By.xpath("//*[@value='roundtrip']//preceding::font[5]"));
		
		wait.until(ExpectedConditions.titleContains("Flight Details"));
		String flightPage = FlightDetail.getText();
		System.out.println(flightPage);
		
		FlightDetail.isDisplayed();

	}

}
