package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelPrac {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\star electronics\\eclipse-workspace\\SeleniumPrac\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.coforge.com/");
	driver.manage().window().maximize();
	WebElement btnClick = driver.findElement(By.xpath("//button[@type='button']"));
	btnClick.click();
	WebElement services = driver.findElement(By.xpath("//a[@id ='Services']"));
	services.click();
	
}
}
