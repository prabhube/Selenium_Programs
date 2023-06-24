package org.one;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandle {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem\\eclipse-workspace\\SeleniumPrograms\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Robot s= new Robot();
		s.keyPress(KeyEvent.VK_P);
		s.keyRelease(KeyEvent.VK_P);
		s.keyPress(KeyEvent.VK_R);
		s.keyRelease(KeyEvent.VK_R);
		s.keyPress(KeyEvent.VK_A);
		s.keyRelease(KeyEvent.VK_A);
		s.keyPress(KeyEvent.VK_B);
		s.keyRelease(KeyEvent.VK_B);
		s.keyPress(KeyEvent.VK_H);
		s.keyRelease(KeyEvent.VK_H);
		s.keyPress(KeyEvent.VK_U);
		s.keyRelease(KeyEvent.VK_U);
		s.keyPress(KeyEvent.VK_B);
		s.keyRelease(KeyEvent.VK_B);
		s.keyPress(KeyEvent.VK_E);
		s.keyRelease(KeyEvent.VK_E);
		s.keyPress(KeyEvent.VK_TAB);
		s.keyRelease(KeyEvent.VK_TAB);
		s.keyPress(KeyEvent.VK_SHIFT);
		s.keyPress(KeyEvent.VK_K);
		s.keyRelease(KeyEvent.VK_K);
		s.keyRelease(KeyEvent.VK_SHIFT);
		s.keyPress(KeyEvent.VK_A);
		s.keyRelease(KeyEvent.VK_A);
		s.keyPress(KeyEvent.VK_S);
		s.keyRelease(KeyEvent.VK_S);
		s.keyPress(KeyEvent.VK_T);
		s.keyRelease(KeyEvent.VK_T);
		s.keyPress(KeyEvent.VK_H);
		s.keyRelease(KeyEvent.VK_H);
		s.keyPress(KeyEvent.VK_U);
		s.keyRelease(KeyEvent.VK_U);
		s.keyPress(KeyEvent.VK_R);
		s.keyRelease(KeyEvent.VK_R);
		s.keyPress(KeyEvent.VK_I);
		s.keyRelease(KeyEvent.VK_I);
		s.keyPress(KeyEvent.VK_R);
		s.keyRelease(KeyEvent.VK_R);
		s.keyPress(KeyEvent.VK_A);
		s.keyRelease(KeyEvent.VK_A);
		s.keyPress(KeyEvent.VK_J);
		s.keyRelease(KeyEvent.VK_J);
		s.keyPress(KeyEvent.VK_A);
		s.keyRelease(KeyEvent.VK_A);
		s.keyPress(KeyEvent.VK_1);
		s.keyRelease(KeyEvent.VK_1);
		s.keyPress(KeyEvent.VK_SHIFT);
		s.keyPress(KeyEvent.VK_1);
		s.keyRelease(KeyEvent.VK_1);
		s.keyRelease(KeyEvent.VK_SHIFT);
		s.keyPress(KeyEvent.VK_TAB);
		s.keyRelease(KeyEvent.VK_TAB);
		s.keyPress(KeyEvent.VK_TAB);
		s.keyRelease(KeyEvent.VK_TAB);
		s.keyPress(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);
	}
}
