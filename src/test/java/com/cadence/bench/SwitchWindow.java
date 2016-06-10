package com.cadence.bench;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SwitchWindow {
	
	@Test
	public static void switchingBetweenWindows() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.tutorialspoint.com/google_maps/index.htm");
		driver.manage().window().maximize();
		System.out.println("Window handle for default page " +driver.getWindowHandle());
		driver.findElement(By.xpath("//div[@class='simple-ad']//a[1]//img[@src='/images/facebookIcon.jpg']")).click();
	
Thread.sleep(10000);
		
		System.out.println(" 1. Window handle for default page " +driver.getWindowHandle());
		System.out.println(" 1. Webdriver opened the URL ->> " +driver.getCurrentUrl());
		System.out.println(" 1. Webdriver opened the page titled ->> " +driver.getTitle());		
		Set<String> handles=driver.getWindowHandles();
		Iterator it=handles.iterator();
		while (it.hasNext()){
			String parent = (String) it.next();
			String newwin = (String) it.next();
			driver.switchTo().window(newwin);
			//perform actions on new window
			System.out.println(" 2. Window handle for default page " +driver.getWindowHandle());
			System.out.println(" 2. Webdriver opened the URL ->> " +driver.getCurrentUrl());
			System.out.println(" 2. Webdriver opened the page titled ->> " +driver.getTitle());	
			driver.close();
			System.out.println("parent " +parent);
			System.out.println("newwin " +newwin);
		//	System.out.println(" 2. Window handle for default page " +driver.getWindowHandle());
		//	System.out.println(" 2. Webdriver opened the URL ->> " +driver.getCurrentUrl());
			//System.out.println(" 2. Webdriver opened the page titled ->> " +driver.getTitle());	
			driver.switchTo().window(parent);
			System.out.println(" 3. Window handle for default page " +driver.getWindowHandle());
			System.out.println(" 3. Webdriver opened the URL ->> " +driver.getCurrentUrl());
			System.out.println(" 3. Webdriver opened the page titled ->> " +driver.getTitle());	
			            }
		
		
			
		}
		/*			driver.findElement(By.xpath("//div[@class='simple-ad']//a[2]//img[@src='/images/twitterIcon.jpg']")).click();
		Thread.sleep(10000);
		System.out.println(" 2. Webdriver opened the URL ->> " +driver.getCurrentUrl());
		System.out.println(" 2. Webdriver opened the page titled ->> " +driver.getTitle());	
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='simple-ad']//a[3]//img[@src='/images/linkedinIcon.jpg']")).click();
		Thread.sleep(10000);
		System.out.println(" 3. Webdriver opened the URL ->> " +driver.getCurrentUrl());
		System.out.println(" 3. Webdriver opened the page titled ->> " +driver.getTitle());
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='simple-ad']//a[4]//img[@src='/images/googlePlusIcon.jpg']")).click();
		System.out.println(" 4. Webdriver opened the URL ->> " +driver.getCurrentUrl());
		System.out.println(" 4. Webdriver opened the page titled ->> " +driver.getTitle());	
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='simple-ad']//a[5]//img[@src='/images/StumbleUponIcon.jpg']")).click();
		System.out.println(" 5. Webdriver opened the URL ->> " +driver.getCurrentUrl());
		System.out.println(" 5. Webdriver opened the page titled ->> " +driver.getTitle());	
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='simple-ad']//a[6]//img[@src='/images/reddit.jpg']")).click();
		System.out.println(" 6. Webdriver opened the URL ->> " +driver.getCurrentUrl());
		System.out.println(" 6. Webdriver opened the page titled ->> " +driver.getTitle());	
		*/
		
	}


