package org.one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumPrograms\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println("No of 'a' tag thios page"+ allLinks.size());
	for (WebElement listOflink : allLinks) {
		String link= listOflink.getAttribute("href");
		System.out.println(link);
	}
}
	
	
}
