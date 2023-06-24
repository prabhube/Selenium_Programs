package org.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\prem\\\\eclipse-workspace\\\\SeleniumPrograms\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("prabhu");
		driver.findElement(By.name("lname")).sendKeys("rajaraman");
		
	
	}
}
