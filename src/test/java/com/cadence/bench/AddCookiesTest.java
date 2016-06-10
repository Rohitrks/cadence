package com.cadence.bench;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AddCookiesTest {


	@Test(threadPoolSize=5)

	public void addCookiesTest() throws InterruptedException{

		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*System.setProperty("webdriver.chrome.driver", "/bench/drivers/win/chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/

		String URL="http://flipkart.com/";
		driver.get(URL);
		//we should pass name and value for cookie as parameters
		// In this example we are passing, name=mycookie and value=123456789123
		Cookie name= new Cookie("myCookie", "123456789123");
		driver.manage().addCookie(name);
		Set<Cookie> cookieslist= driver.manage().getCookies();
		for(Cookie getcookies :cookieslist){
			System.out.println(getcookies);
		}
		System.out.println("The value of the cookie added is " +name.getValue());
		Thread.sleep(3000);
		driver.close();
		
		

	}



}
