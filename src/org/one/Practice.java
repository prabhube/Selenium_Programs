package org.one;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
		public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","path");
		WebDriver driver=new ChromeDriver();
		driver.get("www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		TakesScreenshot s=(TakesScreenshot) driver;
		File output=s.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(output,new File("path"));
		
		}
}