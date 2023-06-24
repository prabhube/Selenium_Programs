package org.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.io.ManagedSelector.SelectorUpdate;

public final class UsingFinal {
	public static void setup(String name) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem\\eclipse-workspace\\SeleniumPrograms\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(name);
		driver.manage().window().maximize();
	}
	public static void main(String[] args) {
	setup("https://www.cityunionbank.com/");
	}
}
