package com.cadence.bench;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;


public class launchFb {
	
	//static WebDriver driver=Driver.driver;
	static TakeScreenshot takeScreenshot;
	
	
	@Test
	public void launchFacebook() throws IOException, AWTException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shrohit\\Documents\\GitHub\\cadence\\drivers\\win\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\shrohit\\Documents\\GitHub\\cadence\\test-output\\screenshots\\image"+".png"));
		
	}

}
