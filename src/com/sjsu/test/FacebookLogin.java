package com.sjsu.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("#u_0_1")).sendKeys("Testing");
		driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("Selenium");
		driver.findElement(By.xpath(".//*[@id='u_0_5']")).sendKeys("1234567890");
		driver.findElement(By.xpath(".//*[@id='u_0_8']")).sendKeys("1234567890");
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("Testing123#");
		
		//For selecting date
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByVisibleText("Sep");
		
		//For selecting date
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel2.selectByIndex(3);
		
		//For selecting date
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByValue("1995");
		
		//Clicks the radio button for sex
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).click();
		
		//Clicks the next button
		//driver.findElement(By.xpath(".//*[@id='u_0_i']")).click();
		
		//For clicking the link to create new pag
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		
		//To come back to login page
		driver.navigate().back();
		
		//To end the session and close all windows
		driver.quit();
	}

}
