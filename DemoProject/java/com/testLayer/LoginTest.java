package com.testLayer;


import org.testng.Assert;
import org.testng.annotations.Test;


import com.testBase.TestBase;


public class LoginTest extends TestBase{
	
	String expectedurl = "https://www.apps.dalalstreet.ai/dashboard";

	@Test
	public void verifyLoginTest() throws InterruptedException
	{

		Thread.sleep(3000);
		Assert.assertEquals(util.geturl(), expectedurl);
		System.out.println(util.geturl());
		
	}

}
