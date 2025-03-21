package Selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

	public static void main(String[] args) {
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		
		driver.findElement(By.xpath("//*[@id='newTabBtn']")).click();
		String prt = driver.getWindowHandle();
		Set<String> child= driver.getWindowHandles();
		
		for (String ch:child) {
			if(!ch.equalsIgnoreCase(prt)) {
				driver.switchTo().window(ch);
			}
		 
		// TODO Auto-generated method stub

	}

	}}
