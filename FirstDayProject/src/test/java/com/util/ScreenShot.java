package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void scshot(WebDriver driver,String s) throws IOException {
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File fl=tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl,new File(s+".png"));
	}
	}
	


//For screenshoot we use takessreenshot word and we call variable 