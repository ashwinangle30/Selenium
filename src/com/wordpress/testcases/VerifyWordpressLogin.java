package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

public class VerifyWordpressLogin {
	
	@Test
	public void verifyValidLogin(){
		
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage login = new LoginPage(driver);
		login.loginToWordpress("admin", "demo123");

		driver.quit();
	}

}
