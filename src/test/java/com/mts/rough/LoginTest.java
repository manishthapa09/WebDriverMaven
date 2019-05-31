package com.mts.rough;

import com.mts.base.Page;
import com.mts.pages.HomePage;
import com.mts.pages.LoginPage;
import com.mts.pages.ZohoAppPage;
import com.mts.pages.crm.CRMHomePage;
import com.mts.pages.crm.accounts.AccountsPage;
import com.mts.pages.crm.accounts.CreateAccountPage;

public class LoginTest{

	public static void main(String[] args) {
		
		//Using EGit plugin!!!
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin("manishthapa09@gmail.com", "mondeo35");
		zp.goToCRM();
		AccountsPage account = Page.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccounts();
		cap.createAccount("Manish");
		
		
	}

}
