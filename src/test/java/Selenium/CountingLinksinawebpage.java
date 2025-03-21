package Selenium;

import java.util.Iterator;
import java.util.Set;

 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinksinawebpage {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.qaclickacademy.com/practice.php");
		 
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //you have to use only singular FindElements
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
   
		//Countings Links for particular sections
		
		WebElement coloumdriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		//xpath using parent
		System.out.println(coloumdriver.findElements(By.tagName("a")).size());
		
		//Click on each link on webpage it's opening or not
		
		for(int i=1;i<coloumdriver.findElements(By.tagName("a")).size();i++) {
			
			
			//below one line is used to click on each link seperately
			
			String clickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			//  you have to pass the above variable in below sendkeys value
			coloumdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			
			Thread.sleep(5000L);
			
		}
		
			
			//New windows opening handle technique
			
			Set<String> ab = driver.getWindowHandles();
			
			Iterator<String> it = ab.iterator();
			
			while(it.hasNext()){  //hasnext() is used to check the any other child tab present or not
				
				driver.switchTo().window(it.next()); //it.next() is used to switch the tab
				
				System.out.println(driver.getTitle());
				
				//while loop will  execte until the condition become fails
			}
			
			
			

		
		
	}

}
