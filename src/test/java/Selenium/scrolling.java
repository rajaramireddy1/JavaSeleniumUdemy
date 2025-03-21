package Selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
 

public class scrolling {

	public static void main(String[] args) {
		
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		
		List<WebElement> op = driver.findElements(By.xpath("//*[@class=\"homepage-clients-logo\"]"));
		for( WebElement option:op) {
			
		 if(option.getText().equalsIgnoreCase("Sandals"))	 
					{
				option.click();
				break;
			}
	}

	}}
