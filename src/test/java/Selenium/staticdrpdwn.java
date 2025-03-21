package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 

public class staticdrpdwn {

	public static void main(String[] args) {

		 

		WebDriver driver= new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println("Hii");

		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//*[@name=\"ctl00$mainContent$DropDownListCurrency\"]")).click();
		System.out.println( driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());*/
		
		WebElement drop =  driver.findElement(By.xpath("//select[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
		
		Select val = new Select(drop);
		
		
		val.selectByIndex(2);
		//val.selectByValue("");
//		val.selectByVisibleText("");
		
		System.out.println(val.getFirstSelectedOption().getText());
	}

}
