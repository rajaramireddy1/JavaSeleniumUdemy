package Udemy_Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://support.google.com/mail/answer/8494?hl=en&co=GENIE.Platform%3DDesktop");
			
			Set<String> handles =driver.getWindowHandles();
			Iterator<String> it =handles.iterator();
			
			

	}

}
