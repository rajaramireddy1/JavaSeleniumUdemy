package selenium_InterviewCodes;



import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemsToCart {

	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] veggiesNeeded = {"Beetroot ","Carrot "};

		List<WebElement> product = driver.findElements(By.cssSelector("[class='product-name']"));

		for(int i=0; i<product.size();i++)
		{
			String name = product.get(i).getText();
//			String[] name = product.get(i).getText().split("-");
//			String productname =name[0].trim();
			
			List requireditems =Arrays.asList(veggiesNeeded);
			int j=0;
			if(requireditems.contains(name)) {
				
				j++;

				//if(productname.equalsIgnoreCase(veg)) {
				driver.findElements(By.xpath("//button[text() ='ADD TO CART']")).get(i).click();
				if(j==2) {
				break;
			}
		}


	}

}
}
