package com.mts.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.mts.base.Page;
import com.mts.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{

	public void goToCalneder() {

		click("calendarlink_XPATH");
	}

	public void goToCliq() {

		click("cliqlink_XPATH");
	}

	public CRMHomePage goToCRM() {

		click("crmlink_XPATH");
		
		return new CRMHomePage();
	}

	public void goToMail() {

		click("maillink_XPATH");
	}

	public void goToMeeting() {

		click("meetinglink_XPATH");
	}
}
