package StatusHandlinds;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SortingItemsusingStreams {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click();

		List<WebElement> Elements =  driver.findElements(By.xpath("//tr/td[1]"));


		List<String> originallist = Elements.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(originallist);

		//By adding sorted() in above originallist same as below line
		List<String> Sortedlist = Elements.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
		System.out.println(Sortedlist);

		Assert.assertTrue(Sortedlist.equals(originallist));

		List<String> price=Elements.stream().filter(s->s.getText().contains("Beans")).map(s-> getPriceVegie(s)).collect(Collectors.toList());

		price.forEach(a-> System.out.println(a)); // you can use any element in  the place of a

		 
	}

	private static String getPriceVegie(WebElement s) {
		String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
 		return pricevalue;

	}

}
