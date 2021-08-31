package org.othername;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
public void getDriver(String browser) {
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\star electronics\\eclipse-workspace\\CheckMaven\\drivers\\chromedriver.exe");
	 	driver = new ChromeDriver ();
	} else if (browser.equalsIgnoreCase(("firefox"))){
		System.setProperty("webdriver.gecko.driver", "");
         driver = new FirefoxDriver();
	}
}
public void geturl(String url ) {
driver.get(url);
driver.manage().window().maximize();
}
public WebElement locators (String loc ,String data) {
	WebElement element = null;
	if (loc.equalsIgnoreCase("id")) {
		element = driver.findElement(By.id(data));
	} else if (loc.equalsIgnoreCase("xpath")) {
		element = driver.findElement(By.xpath(data));
	}else if (loc.equalsIgnoreCase("name")) {
		element = driver.findElement(By.name(data));
	}
	return element;
}
}
