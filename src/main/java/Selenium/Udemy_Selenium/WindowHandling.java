package Selenium.Udemy_Selenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"blinkingText\"]")).click();
		
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String ParentWindow = it.next();
		String ChildWindow = it.next();
		
		driver.switchTo().window(ChildWindow);
		driver.findElement(By.linkText("https://www.udemy.com/user/rahul445/")).click();
		
		
//		Thread.sleep(200000);
//		driver.close();
		
	}

}
