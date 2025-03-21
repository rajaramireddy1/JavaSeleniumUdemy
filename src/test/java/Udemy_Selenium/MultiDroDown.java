package Udemy_Selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class MultiDroDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();

		WebElement first = driver.findElement(By.id("course"));
		Information(first, "Python");  //Here drop is below method

		WebElement Second = driver.findElement(By.id("ide"));
		Information(Second, "Eclipse");
		Information(Second, "NetBeans");
		Information(Second, "IntelliJ IDEA");



	}

	public static void Information(WebElement data, String val) {
		Select dropdown = new Select(data);
		List<WebElement> values =dropdown.getOptions();

		for(WebElement val1 : values) {

			if(val1.getText().equalsIgnoreCase(val)) {
				val1.click();
				break;

			}

		}


	}}
