package com.cadence.genericLib;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Driver {
	static FirefoxProfile fp = new FirefoxProfile();
	public static WebDriver driver= new FirefoxDriver(fp);

	//public static WebDriver driver= new InternetExplorerDriver();// remove comment to run in IE & put comment on others

	// public static WebDriver driver = new ChromeDriver();// remove comment to run in Chrome & put comment on others


}



