package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		LinkText 
//	    WebElement Homelink = driver.findElement(By.linkText("Home"));
//	    Homelink.click();
//	    
////	    Partial Link Text
//	    WebElement HomePartiallink = driver.findElement(By.linkText("practicetestautomation"));
//	    HomePartiallink.click();
		
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		// //input[@name='password']
		
		WebElement submit = driver.findElement(By.cssSelector("button[id='submit']"));
		
//		Normal xpath
//		//*[@id='wpforms-161-field_2']
		
//		Text - xpath
//		//*[text()='Submit']  
		
//		contains - xpath
//		//*[contains(text(),'Submi')]
		
//		Following xpath
//		//*[@name = 'wpforms[fields][0][first]']//following::div[1]/input
		
//		Preceding xpath
//		//*[@name = 'wpforms[fields][1]']//preceding::input[2]

	}

}
