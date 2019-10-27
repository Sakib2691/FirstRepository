package com.util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
		
		
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions ac=new Actions(driver);
		
		WebElement a=driver.findElement(By.xpath("(//a[contains(text(),' My eBay')])[1]"));
		WebElement b=driver.findElement(By.xpath("//a[contains(text(),' Selling')]"));
		ac.moveToElement(a).moveToElement(b).click().perform();
		ScreenShot.scshot(driver, "MouseOver");
		
	}

}
