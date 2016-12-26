package com.cadence.cos2;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.cadence.genericLib.Driver;
import com.cadence.genericLib.ExcelLib;
import com.cadence.genericLib.WebDriverLib;
import com.cadence.objectrepository.CosLoginPage;
import com.cadence.objectrepository.CosSupportHomePage;

public class TestCosLogin {
	static ExcelLib excelLib=new ExcelLib();
	static WebDriver driver=Driver.driver;
	static CosLoginPage cosLoginPage;
	static CosSupportHomePage cosSupportHomePage;
	static WebDriverLib webDriverLib;

	@BeforeTest
	public static void lunchApp() throws InvalidFormatException,NullPointerException, IOException{
		String url=excelLib.getExcelData("testdata1", 1, 0);
		System.out.println(url);
		driver.get(url);
		driver.manage().window().maximize();


	}

	@Test(priority=0)
	public static void loginToCosApp(){
		cosLoginPage=PageFactory.initElements(driver,CosLoginPage.class);
		String username = null;
		try {
			username = excelLib.getExcelData("testdata1", 1, 1);
		} catch (InvalidFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String password = null;
	
		try {
			password = excelLib.getExcelData("testdata1", 1, 2);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
			System.out.println("Invalid Formate Exception while fetching Password form Excel");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO Exception while fetching Password form Excel");
		}
		cosLoginPage.getLoginId().sendKeys(username);
		cosLoginPage.getPassword().sendKeys(password);
		cosLoginPage.getLoginButton().click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}


	@Test(priority=1)
	public static void LogoutofCOSApp() throws InterruptedException{	
		 Thread.sleep(5000);
		driver.findElement(By.cssSelector("#userIcon > span.user-chevron > i.fa.fa-chevron-down")).click();
		 Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.action.sction-last"))); 
		driver.findElement(By.cssSelector("div.action.sction-last")).click();
		/*cosSupportHomePage.getUserIcon().click();
		cosSupportHomePage.getLogoutButton().click();*/
	    Thread.sleep(9000);

	}
	
	@AfterTest()
	  public void tearDown() throws Exception {
	    driver.quit();
	   	    }
	  }

