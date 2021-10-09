package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectIIndex {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\star electronics\\eclipse-workspace\\SeleniumPrac\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("");
}
}
