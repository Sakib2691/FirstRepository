package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main (String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement Female=driver.findElement(By.xpath("//input[@id='u_0_9']"));
	Female.click();
	boolean x=Female.isEnabled();
	System.out.println(x);
}
}
