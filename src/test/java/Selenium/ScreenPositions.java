package Selenium;

import org.openqa.selenium.By;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 

public class ScreenPositions {


	public static void main(String[] args) throws InterruptedException {

		 
		WebDriver driver  = new ChromeDriver();

		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();

		driver.manage().window().setSize(new org.openqa.selenium.Dimension(100, 100));
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		Thread.sleep(5000);


		driver.manage().window().minimize();
		driver.manage().window().getPosition();

		driver.navigate().to("https://capgemini.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/1979294?start=540#overview");
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();

		//System.out.println(driver.findElement(By.xpath("//*[@class=\"vjs-tech\"]")).);

		Thread.sleep(5000);
		driver.close();






	}

}
