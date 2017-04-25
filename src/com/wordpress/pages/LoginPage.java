package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username = By.xpath(".//*[@id='user_login']");
	By password = By.xpath(".//*[@id='user_pass']");
	By loginButton = By.xpath(".//*[@id='wp-submit']");
	
	public LoginPage(WebDriver driver){
		this.driver = driver;	
	}
	
	public void loginToWordpress(String user,String pass){
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
}
