package Selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class addingItemstocart {

	public static void main(String[] args) throws InterruptedException {

		//WebDriverManager.chromedriver().setup();

		WebDriver  driver = new ChromeDriver();

		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));


		for(int i=0; i<products.size();i++)
		{
			String   name = products.get(i).getText();
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
			
		}

	}}
