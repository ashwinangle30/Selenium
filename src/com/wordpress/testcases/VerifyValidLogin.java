package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.helper.BrowserFactory;
import com.wordpress.pages.LoginPagePOM;

public class VerifyValidLogin {
	
	@Test
	public void checkValidLogin(){
		
		//This will launch the browser
		WebDriver driver = BrowserFactory.startBrowser("firefox","http://demosite.center/wordpress/wp-login.php");
		
		//This will create page object of the page using Page Factory
		LoginPagePOM loginpage = PageFactory.initElements(driver,LoginPagePOM.class);
		
		//This will call the method
		loginpage.loginToWordpress("admin","demo123");
		
	}

}
