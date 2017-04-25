	package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagePOM {
	
	WebDriver driver;
	
	public LoginPagePOM(WebDriver driver){
		this.driver = driver;
	}

	@FindBy(id="user_login")
	WebElement username;
	
	@FindBy(how=How.XPATH,using=".//*[@id='user_pass']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using=".//*[@id='wp_submit']")
	WebElement submitButton;
	
	public void loginToWordpress(String user,String pass){
		username.sendKeys(user);
		password.sendKeys(pass);
		submitButton.click();
	}
}
