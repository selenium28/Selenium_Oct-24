package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {

	public static void main(String[] args) {
//		WebDriver - Interface in Selenium
//		driver - reference variable
//		new - keyword
//		ChromeDriver - Class
//		new ChromeDriver(); - Object
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/");
		
//		WebDriver driver1 = new WebDriver(); -> we can't use like this 
//		ChromeDriver driver2 = new ChromeDriver();
		

	}

}
