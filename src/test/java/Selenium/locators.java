package Selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

 

public class locators {
	 
	public static void main(String args[]) throws InterruptedException {
		 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());  //TITTLE


		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Rahul");                  //Syntax for css selector usuig id =>(tagnamea#"id")

		driver.findElement(By.xpath("//*[@id='container']/div[2]/form/input[2]")).sendKeys("hello123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //cssSelector= Tagname.classvalue
		
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Raja");            //Syntax for css selector

		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("jhon@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("45");
		driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).clear();  //Clear is used to remove the given data just for checking
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7799894100");
		driver.findElement(By.xpath("//button[@class=\"reset-pwd-btn\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click(); //xpath using childs
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Raja");

		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("rahulshettyacademy");  //finding xpath using small value present in the atribute.

		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();

		driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();


		Thread.sleep(5000);
		 

		System.out.println(driver.getCurrentUrl());    //CURRENY URL
		

		System.out.println();// crl+space+enter
		driver.close();



	}
}