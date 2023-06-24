package org.one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cubinspect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\SeleniumPrograms\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cityunionbank.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

		WebElement acce = driver.findElement(By.xpath("(//a[text()='Academic Institution'])[2]"));
		
		Actions s=new Actions(driver);
		s.moveToElement(acce).perform();
		Thread.sleep(2000);
		WebElement deposit = driver.findElement(By.xpath("(//h5[text()='Deposits and Investments'])[6]"));
		s.moveToElement(deposit).perform();
		WebElement gold = driver.findElement(By.xpath("(//a[text()='CUB Sovereign Gold Bond'])[12]"));
		s.click(gold).perform();
		
	}
}