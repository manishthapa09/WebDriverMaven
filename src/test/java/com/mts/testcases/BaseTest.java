package com.mts.testcases;

import org.testng.annotations.AfterSuite;

import com.mts.base.Page;

public class BaseTest {
	
	@AfterSuite
	public void tearDown() {
		Page.quite();
	}

}
