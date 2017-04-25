package com.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName,String url){
		
		if(browserName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else
			if(browserName.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver","D:/chromedriver_win32/chromedriver.exe");
				driver = new ChromeDriver();
			}else
				if(browserName.equalsIgnoreCase("IE")){
					driver = new InternetExplorerDriver();
				}
		
		driver.get(url);
		
		return driver;
	}
}
