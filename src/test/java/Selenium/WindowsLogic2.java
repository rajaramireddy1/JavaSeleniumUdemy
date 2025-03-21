package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsLogic2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		driver.manage().window().maximize();
		driver.findElement(By.id("newWindowBtn")).click();

		// logic
		String parentwindow = driver.getWindowHandle();

		Set<String> childwindow = driver.getWindowHandles();

		for( String Childwindow : childwindow) { 

			if(!Childwindow.equals( parentwindow)) {

				driver.switchTo().window(Childwindow);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.findElement(By.id("englishchbx")).click();
				

			}
			driver.switchTo().window(parentwindow);


		}}}


