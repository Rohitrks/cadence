package com.cadence.bench;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintTest {

	@Test(invocationCount=4,threadPoolSize=5,dependsOnMethods="n1",enabled=false)
public static void m()
{
		
	String ExcelSheetPath = System.getProperty("user.dir");
	System.out.println("default value of user.dir -- >> " +ExcelSheetPath);
	System.out.println("<<<<<<<<<--------+++Executing m method+++ ---------->>>>>>>>>");
	Assert.assertEquals(true, true ,"The test is failing ,this is the message to be displayed on failure");
	}
	
	
	@Test(groups="n")
	public static void n(){
				System.out.println("Executing n method");
				Assert.assertEquals(false, true);
	}
	
	
	@Test(groups="n")
	public static void n1(){
				System.out.println("Executing n1 method ");
	}
	
	@Test(groups="n")
	public static void n2(){
				System.out.println("Executing n2 method ");
	}
	
}
