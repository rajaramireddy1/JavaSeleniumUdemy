package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendars {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.xpath("//*[@id='travel_date'][4]")).click();
		List<WebElement > dates = driver.findElements(By.className("day")) ;
		int count =  driver.findElements(By.className("day")).size();

		for(int i=0;i<count;i++)
		{ 
			String text=dates.get(i).getText();
			if(text.equalsIgnoreCase("30")) 
			{
				driver.findElements(By.className("day")).get(i).click();
				break;

			}

		}

	}

}
