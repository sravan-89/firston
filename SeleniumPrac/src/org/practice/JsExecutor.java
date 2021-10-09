package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\star electronics\\eclipse-workspace\\SeleniumPrac\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://en-gb.facebook.com/");
	WebElement userName = driver.findElement(By.id("email"));
	//Type casting one interface into another interface
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//scroll down 
   WebElement btnSignUp = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
   //btnSignUp.click();
   
   js.executeScript("arguments[0].scrollIntoView(true)", btnSignUp);
   Thread.sleep(2000);
   // Scroll Up
   js.executeScript("arguments[0].scrollIntoView(false)",userName);
   
	
}
}
