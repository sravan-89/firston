package org.checkselenium;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\star electronics\\eclipse-workspace\\SeleniumDay1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.iplt20.com/");
		WebElement findElement = driver.findElement(By.xpath("/html/body/header/div[1]/div/nav/div[1]/div[2]/ul/li[4]/a"));
		findElement.click();
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		WebElement kkr = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/table/tbody/tr[8]/td[2]/a/span[1]"));
	     String text = kkr.getText();
	     System.out.println("value of the table " +text);
	     
	}
}
