package com.mts.pages.crm.accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.mts.base.Page;

public class AccountsPage extends Page {

	public CreateAccountPage goToCreateAccounts() {
		
		click("createaccountbtn_XPATH");
		
		return new CreateAccountPage();
	}
	
	public void goToImportAccounts() {
		
	}
}
