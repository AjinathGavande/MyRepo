package com.testLayer;

import org.testng.annotations.Test;

import com.pageLayer.DashboardPage;
import com.pageLayer.ExchangePage;
import com.testBase.TestBase;
import com.utility.UtilClass;

public class BuyScenarioes extends TestBase
{

	@Test
	public void buyShare() throws InterruptedException
	{
		DashboardPage dash = new DashboardPage();
		ExchangePage exchange = new ExchangePage();
		Thread.sleep(3000);
		dash.enterCompanyName("Wipro");
		dash.clickOnCompanyOption();
		Thread.sleep(3000);
		exchange.clickOnBuyButton1();
		Thread.sleep(2000);
		exchange.enterQuantity("2");
		Thread.sleep(2000);
		util.javascriptExecutor();
		Thread.sleep(3000);
		exchange.clickOnBuyButton2();
	}
}
