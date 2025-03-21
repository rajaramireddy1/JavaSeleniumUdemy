package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("name")).sendKeys("Text");
		 driver.switchTo().frame("frm1");
		 
		 Select drp = new Select(driver.findElement(By.id("course")));
		 drp.selectByIndex(3);
		 System.out.println(drp.getFirstSelectedOption());
		 
		 
		 Thread.sleep(5000);
		// driver.close();

	}

}
