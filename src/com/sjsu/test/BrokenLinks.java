package com.sjsu.test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		//To get list of links 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links are:: "+links.size());
		
		for(int i=0;i<links.size();i++){
			WebElement elem = links.get(i);
			String url = elem.getAttribute("href");
			verifylink(url);
		}
		
		
	}

	private static void verifylink(String urlLink) {
		
		try{
			URL url = new URL(urlLink);
			
			//creates a connection and return an object of type HttpURLConnection
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			
			httpURLConnect.setConnectTimeout(3000);
			
			httpURLConnect.connect();
			
			if(httpURLConnect.getResponseCode()==200){
				System.out.println(urlLink+" - "+httpURLConnect.getResponseMessage());
			}else
				if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
					System.out.println(urlLink+" - "+httpURLConnect.getResponseMessage()+" - "+HttpURLConnection.HTTP_NOT_FOUND);
				}
		}catch(Exception e){
			
		}
	}

}
