package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragandDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\star electronics\\eclipse-workspace\\SeleniumPrac\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com");
	driver.manage().window().maximize();
//	Thread.sleep(3000);
//	WebElement userName = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
//	userName.sendKeys("Sravan98");
//	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("123345");
//	Thread.sleep(3000);;
//	driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
}
}
