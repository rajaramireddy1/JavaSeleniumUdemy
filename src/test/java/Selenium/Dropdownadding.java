package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownadding {
	static int i=1;

	public static void main(String[] args) throws InterruptedException {

		 
		WebDriver driver= new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
		//System.out.println(driver.getCurrentUrl());

		Thread.sleep(2000L);

		for( int i=1; i<=4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
 		}
		System.out.println(driver.findElement(By.className("paxinfo")).getText());

		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(3000L);
		System.out.println(driver.findElement(By.className("paxinfo")).getText());
		
		driver.close();
	 





	}

}
