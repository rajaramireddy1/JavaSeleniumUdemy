package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");


		// driver.switchTo().frame();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));  //main frame
	  
		//driver.findElement(By.id( "draggable")).click(); //for clicking the Dragable box
		//driver.switchTo().frame(0);  //using Index 1st frame frame(0)
	
		Actions a = new Actions(driver);

		WebElement Source =  driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		a.dragAndDrop(Source, target).build().perform(); //Build().Perform() is used to perform the particular frame actions

		//up to above code there in frames so to get back to original element we have to use below linw

		driver.switchTo().defaultContent();  //For moving to default content 

	}
}


