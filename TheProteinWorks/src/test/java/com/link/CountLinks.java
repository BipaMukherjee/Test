package com.link;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) throws IOException {

		//		 Initiate driver
		System.setProperty("webdriver.chrome.driver", "/Users/sahadatdipu/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();

		//		Open URL
		driver.get("https://pensive-darwin.theproteinworks.com/products/protein-shakes");
		

		//		Implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		//		Maximise Page
		driver.manage().window().maximize();
		

		//		capture links from a WebPage
		List <WebElement> links=driver.findElements(By.tagName("a"));

		//		Number of links
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			

		//	by using href attribute we can get URL of required link
			
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			
			URL link = new URL(url);

		//	create a connection using url object 'link'
		
			HttpURLConnection httpConn =(HttpURLConnection) link.openConnection();
			

		//	Implicit wait for 10 seconds
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//	establish connection
		
			httpConn.connect();
			
			int resCode = httpConn.getResponseCode(); //return response code (if res code is above 300:broken or redirect)
			
			if(resCode>=300)
			{
				System.out.println(url + " - "+ "is broken or redirect link");
				
			}
			else {
				System.out.println(url + " - "+ "is valid link");
			}
		}
		
		
		

	}


	}


