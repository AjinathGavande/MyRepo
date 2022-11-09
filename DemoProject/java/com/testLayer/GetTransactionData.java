package com.testLayer;


import org.testng.annotations.Test;

import com.testBase.TestBase;

public class GetTransactionData extends TestBase 
{

	@Test
	public void fetchTransaction() throws InterruptedException
	{
		Thread.sleep(5000);
		dash.clickOnTransaction();
		Thread.sleep(8000);
		//util.javascriptExecutor();
		trans.getTransactionsDetails();
		
	}
}
