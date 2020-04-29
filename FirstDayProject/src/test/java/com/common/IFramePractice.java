package com.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IFramePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./newbrowser/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	WebElement drag=	driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement drop=   driver.findElement(By.xpath("//div[@id='droppable']"));	
		Actions ac=new Actions(driver);
		ac.dragAndDrop(drag, drop).click().build().perform();
		driver.switchTo().defaultContent();
List<WebElement>	 a=	driver.findElements(By.tagName("iframe"));
List<WebElement>	 b=	driver.findElements(By.tagName("a"));
System.out.println(a.size());
	System.out.println(b.size());

	}

}
