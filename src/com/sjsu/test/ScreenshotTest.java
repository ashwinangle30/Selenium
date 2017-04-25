package com.sjsu.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenshotTest {
	
	WebDriver driver;
	
	@Test
	public void captureScreenshot(){
		
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		Utility.captureScreenshot(driver, "BrowserStarted");
		
		driver.findElement(By.xpath(".//*[@id='email1']")).sendKeys("Testing");;
	}

	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(ITestResult.FAILURE==result.getStatus()){
			Utility.captureScreenshot(driver, result.getName());
		}
		
		driver.quit();
	}
}
