package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
			driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		
			

	}

}
