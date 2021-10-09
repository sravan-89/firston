package org.checkselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\star electronics\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Browser Launch 
		driver.get("https://en-gb.facebook.com/");
		// To Maximize the browser window 
		driver.manage().window().maximize();
//		// To get the Title of a browser 
//		String title = driver.getTitle();
//		System.out.println(title);
//		//By Using a locator Xpath for usename textbox
//		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
//		userName.sendKeys("SravanK");
//		// By using a locator ID for password textbox
//		WebElement passWord = driver.findElement(By.id("pass"));
//		passWord.sendKeys("123345");
//	    // By using a locator Name for login
//		WebElement loginBtn = driver.findElement(By.name("login"));
//		loginBtn.click();
//		// To get the current page title 
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("After clicking login button we get the "+currentUrl);
		
		
		
		
		
	
		
	}
}
