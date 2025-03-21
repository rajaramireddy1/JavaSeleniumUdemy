package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

 

public class Dynamicdropdown {
	public static void main(String args[]) throws InterruptedException {
		 
		
		 WebDriver driver = new ChromeDriver();
		 	 

				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath( "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']  ")).click();
				Thread.sleep(3000L);
				driver.findElement(By.xpath("//*[@text=\"Thiruvananthapuram (TRV)\"]")).click();
				System.out.println("From station selected");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("( //*[@text=\'Hyderabad (HYD)\'])[2]")).click();
				
				driver.findElement(By.xpath( "(//*[@class=\"ui-state-default\"])[30]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
				
				Thread.sleep(2000);
				
				for(int i=1;i<=5;i++) {
					
					driver.findElement(By.id("hrefIncAdt")).click();
					
					 
					
				}
				driver.findElement(By.id("btnclosepaxoption")).click();
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
				driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
				
				
				Thread.sleep(5000L);
				//driver.close();
				
				
			}

		}
