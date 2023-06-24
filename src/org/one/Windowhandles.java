package org.one;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumPrograms\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/windows");
		WebElement parent = driver.findElement(By.id("home"));
		parent.click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl());
		Set<String> windowHandles = driver.getWindowHandles();	
		
		System.out.println(windowHandles);
		List<String> li=new ArrayList<String>(windowHandles);
	
//		System.out.println(driver.getTitle());
		int size = li.size();
		System.out.println("No of Windows: "+size);
		driver.switchTo().window(li.get(1));
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(li.get(0));
	System.out.println(driver.getCurrentUrl());
		
	}
}
