package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdown {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		 driver.manage().window().maximize();

			 WebElement first = driver.findElement(By.id("course"));  //Selecting values from static dropdown
			drop(first, "Python");  //Here drop is below method
			 
			WebElement Second = driver.findElement(By.id("ide"));  //Selecting value from Multi dropdown
			drop(Second, "Eclipse");
			drop( Second,"NetBeans");

			
	}

	public static void drop(WebElement ele , String value) {
		
		Select staticdropdown = new Select(ele);
		List<WebElement> data=staticdropdown.getOptions();
		for(WebElement option:data) {
			
			if(option.getText().equalsIgnoreCase(value)) {
				
				option.click();
				break;
				
			} 
		}
	
}
}
