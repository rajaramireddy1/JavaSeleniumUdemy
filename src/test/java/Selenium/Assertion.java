package Selenium;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

//import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		Assert.assertFalse(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_StudentDiscount\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_StudentDiscount\"]")).isSelected());
		System.out.println("Student check box selected above");
		
//Assert.assertTrue() //Assert.assertFalse() ////Assert.assertERquals()

		Thread.sleep(5000);

		driver.close();
	}

}
