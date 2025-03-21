package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.amazon.com/");

		Actions a = new Actions(driver);

		WebElement move = driver.findElement(By.xpath("//a[@class=\"nav-a nav-a-2   nav-progressive-attribute\"][1]"));

		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().perform();

		a.moveToElement(move).contextClick().build().perform();



		//Move To Specific Element
		//a.moveToElement(driver.findElement(By.xpath("//a[@class=\"nav-a nav-a-2   nav-progressive-attribute\"][1]"))).build().perform();


	}
	}
