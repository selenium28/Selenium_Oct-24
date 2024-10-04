package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUpHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement cumID = driver.findElement(By.name("cusid"));
		cumID.sendKeys("rfdre");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		Alert alert = driver.switchTo().alert();
		String popupText = alert.getText();
		System.out.println(popupText);
		
//		alert.accept();
		alert.dismiss();

	}

}
