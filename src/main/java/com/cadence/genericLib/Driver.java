package com.cadence.genericLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Driver {
	static FirefoxProfile fp = new FirefoxProfile();
	public static WebDriver driver= new FirefoxDriver(fp);

	//public static WebDriver driver= new InternetExplorerDriver();
	// public static WebDriver driver = new ChromeDriver();
}



