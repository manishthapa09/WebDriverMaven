package com.mts.pages.crm.accounts;

import org.openqa.selenium.By;

import com.mts.base.Page;

public class CreateAccountPage extends Page {

	
	public void createAccount(String accountName) {
		
		type("accountname_XPATH",accountName);
		
	}
	
}
