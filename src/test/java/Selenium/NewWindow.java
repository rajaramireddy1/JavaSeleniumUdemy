package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://talent.capgemini.com/in");
		//driver.switchTo().newWindow(WindowType.WINDOW); // for opening new WIndow
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://capgemini.udemy.com/organization/home/");
		
		driver.findElement(By.xpath("//form//input[@type=\"text\"][1]")).sendKeys("Selenium java");
		
		}

}
