package Selenium;

import java.time.Duration;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class locatots1 {
	public static void main(String[] args) throws InterruptedException {
		String name="Raja";
		//WebDriverManager.chromedriver().setup();
	 
		//System.setProperty("webriver.chrome.driver","C:\\Users\\RAMRAJA\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");		
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("rahulshettyacademy");  // Xpath using small value present in the atribute.
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		
		driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();
		
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		driver.findElement(By.xpath("//button[@class=\"logout-btn\"]")).click() ;		
		
		

}
}