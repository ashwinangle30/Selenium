package com.sjsu.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GMailLogin {
	
	public static void main(String args[]){
		
		//System.setProperty("webdriver.chrome.driver","D:/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("akashmehra0293");
		driver.findElement(By.id("next")).click();
		/*driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();*/
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("Passwd")).sendKeys("Akash0293");
		driver.findElement(By.id("signIn")).click();
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("inbox")){
			System.out.println("Test Passed");
		}else{
			System.out.println("Test Failed");
		}
		
		driver.close();
		
	}

}
