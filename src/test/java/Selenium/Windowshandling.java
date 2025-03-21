package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.cssSelector(".blinkingText")).click();


		driver.manage().window().maximize();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String>it = windows.iterator();

		String parentId = it.next();  //Its navinate )th index
		String childId = it.next();   //Its move to child window thats why we used 2 times 

		driver.switchTo().window(childId);
		System.out.println("Below  one is child id. It's unique that we are using Set in the place of List");
		System.out.println(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());


		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]; //[1],[0] is index values we need only 1st index so we split it,trin helps us to remove spaces
		//for above line right click and select watch > add new expression>Add above line it split in to 2 valuse one before At amd after At from string
		driver.switchTo().window( parentId);
		//split(" ")[0]; Second time it split usuig spaces so thats why (" ") is used req email id there in 0th index

		driver.findElement(By.id("username")).sendKeys(emailId);

		System.out.println(emailId);

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C://screenshot.png"));


	}

}
