package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testBase.TestBase;

public class LogoutTest extends TestBase
{
	String expectedurl = "https://www.apps.dalalstreet.ai/logout";
	@Test
	public void logoutTest() throws InterruptedException
	{
		Thread.sleep(3000);
		dash.clickOnProfile();
		dash.clickOnPowerOff();
		Thread.sleep(2000);
		System.out.println(util.geturl());
		Assert.assertEquals(util.geturl(),expectedurl);
		
		
	}

}
