package Selenium;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://jqueryui.com/droppable/");
		 
		  
		// driver.switchTo().frame();
		 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		// driver.switchTo().frame(driver.findElement(By.xpath("//*[@lang=\"en\"]"))); // same as abive line using xpath both are code
		 //driver.findElement(By.id( "draggable")).click();
		// driver.switchTo().frame(0);  //using Index 1st frame frame(0)
		 Actions a = new Actions(driver);
		 
		 WebElement Source =  driver.findElement(By.id("draggable"));
		 
		 WebElement target = driver.findElement(By.id("droppable"));
		 
		 a.dragAndDrop(Source, target).build().perform(); //Build().Perform() is used to execute the frames
		 
		 driver.switchTo().defaultContent(); // moving to default content

	}

}	
