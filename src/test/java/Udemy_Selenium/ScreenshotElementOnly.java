package Udemy_Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotElementOnly {

	public static void main(String[] args) throws IOException {
WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://google.com"); //Dont wait until page fully loded there is no in build wait mechanis
		driver.manage().window().maximize();
		
		WebElement info = driver.findElement(By.xpath("//div[@class=\"iblpc\"]"));
		
		File src=info.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("SearchIconElement.png"));
		System.out.print("Success");
		
	}

}
