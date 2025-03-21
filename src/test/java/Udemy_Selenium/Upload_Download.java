package Udemy_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Upload_Download {

	public static void main(String[] args) throws InterruptedException {
		
		String fruitname= "Apple";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/upload-download-test/");
		driver.manage().window().maximize();	
		//driver.findElement(By.xpath("//button[@id='downloadButton']")).click();	
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\ramraja\\Downloads\\download.xlsx");
		
		By ToastMessageLocator = By.cssSelector(".Toastify__toast-body div:nth-child(2)");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ToastMessageLocator));
		
		String Message=driver.findElement(ToastMessageLocator).getText();
		System.out.println(Message);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ToastMessageLocator));
		Thread.sleep(4000);
		String Fruit = driver.findElement(By.xpath("//div[text()="+fruitname+"]")).getText();	
		System.out.println(Fruit);
		
		Thread.sleep(4000);

	}////div[text()='+fruitname+']

}
