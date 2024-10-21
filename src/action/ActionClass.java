package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(2);
		WebElement source = driver.findElement(By.xpath("//*[text()='High Tatras 3']"));
		WebElement destination = driver.findElement(By.id("trash"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(source).moveToElement(destination).release().build().perform();
		

	}

}
