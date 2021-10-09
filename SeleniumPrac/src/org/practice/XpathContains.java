package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathContains {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\star electronics\\eclipse-workspace\\SeleniumPrac\\drivers\\msedgedriver.exe");
	WebDriver driver =  new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	WebElement txtBoxUserName = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[1]"));
	txtBoxUserName.sendKeys("Sravan");
	
	String attribute = txtBoxUserName.getAttribute("value");
	System.out.println(attribute);
	
	WebElement txtPassword = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2]"));
	txtPassword.sendKeys("ertuyi12");
	
	String attribute2 = txtPassword.getAttribute("value");
	System.out.println(attribute2);
	
	WebElement txtBand = driver.findElement(By.xpath("//div[contains(text(),'band')]"));
	String text = txtBand.getText();
	System.out.println(text);
	
	
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
}
}
