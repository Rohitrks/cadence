package com.cadence.bench;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CopyOfPrintTest {

	@Test(threadPoolSize=5)
	public static void m()
	{
		System.out.println("<<<<<<<<<--------+++Java Copy of print test is running+++ ---------->>>>>>>>>");
		Assert.assertEquals(true, true);

		try 
		{ 
			int x = 0; 
			int y = 5 / x; 
		} 

		catch (ArithmeticException ae) 
		{
			System.out.println(" Arithmetic Exception"); 
		} 	

		catch (Exception e) 
		{
			System.out.println("Exception"); 
		} 


		System.out.println("finished");

	}
}


