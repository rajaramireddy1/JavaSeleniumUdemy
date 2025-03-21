package StatusHandlinds;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class BrokenScanEachandEverylink {
	
	public static void main(String args[]) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link : links) {
			
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.connect();
			
			int resCode = conn.getResponseCode();
			System.out.println(resCode);
			if(resCode>400) {
				System.out.println("The link with Text" + link.getText()+ "is broken with code " + resCode);
				Assert.assertTrue(false);
				
			}
		}
		
		
	}
}
