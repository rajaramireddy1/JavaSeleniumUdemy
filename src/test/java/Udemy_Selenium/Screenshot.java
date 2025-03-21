package Udemy_Selenium;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://google.com"); //Dont wait until page fully loded there is no in build wait mechanis
		driver.manage().window().maximize();
		driver.get("http://youtube.com");
		//driver.navigate().back();
		Thread.sleep(5000);
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\RAMRAJA\\Downloads\\New folder .png"));
 		System.out.println("Success");
		
	}

}
