package org.one;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsClass {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\SeleniumPrograms\\Drivers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.alert-software.com/automated-incident-notifications");
			driver.manage().window().maximize();
			WebElement simplealert = driver.findElement(By.id("hs-eu-confirmation-button"));
			simplealert.click();
			
}
}
