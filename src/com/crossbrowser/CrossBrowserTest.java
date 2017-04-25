package com.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CrossBrowserTest {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void crossBrowserTest(String browser){
		
		SoftAssert s_assert = new SoftAssert();
		
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver","D:/chromedriver_win32/chromedriver.exe");
				driver = new ChromeDriver();
			}
	
		driver.get("http://www.learn-automation.com");
		
		s_assert.assertEquals(driver.getTitle(),"Selenium WebDriver Complete Selenium Webdriver tutorials guide Online");
		Assert.assertEquals(driver.getTitle(),"Selenium WebDriver Complete Selenium Webdriver tutorials guide Online");
		
		driver.quit();
	}

}
