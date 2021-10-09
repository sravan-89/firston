package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClasses {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\star electronics\\eclipse-workspace\\SeleniumPractice\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
}
}
