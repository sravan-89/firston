package org.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDays {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\star electronics\\eclipse-workspace\\SeleniumPrac\\drivers\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	// To launch a browser
	driver.get("https://en-gb.facebook.com/");
	//To maximize the browser window
	driver.manage().window().maximize();
	
	// create an obj for action class 
	Actions a = new Actions(driver);
	
	// create obj for Robot Class 
		Robot r = new Robot();
	
	// To find the webelements for username using a locator Xpath
	WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
	userName.sendKeys("Selenium");
	
	// To double click the entered text 
	a.doubleClick(userName).perform();
	
	// To right click the username textbox
	a.contextClick(userName).perform();
	
	// Click down arrow three times to copy the entered text 
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	// To copy the selected text 
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	// To find the webelements for password 
	WebElement passWord = driver.findElement(By.id("pass"));
	
	a.contextClick(passWord).perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
}
}
