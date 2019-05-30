package com.mts.testcases;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mts.base.Page;
import com.mts.pages.ZohoAppPage;
import com.mts.pages.crm.accounts.AccountsPage;
import com.mts.pages.crm.accounts.CreateAccountPage;
import com.mts.utilities.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String,String> data) {
		
		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		
		AccountsPage account = Page.menu.goToAccounts();
		Page.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CreateAccountPage cap = account.goToCreateAccounts();
		
		cap.createAccount(data.get("accountname"));
		
		Assert.fail("Create account test failed");
	}
}
