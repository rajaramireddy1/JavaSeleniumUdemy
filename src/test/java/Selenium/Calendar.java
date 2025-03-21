package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_date_picker")).click();	
		int day=15;
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//a[text()="+day+"]")).click();
		
	}

}