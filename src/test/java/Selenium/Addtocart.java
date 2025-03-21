package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (WebElement product : products) {
            String name = product.getText();
            if (name.contains("Cucumber")) {
                product.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
                break;
            }
        }

    }
}