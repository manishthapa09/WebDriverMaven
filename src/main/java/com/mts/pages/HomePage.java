package com.mts.pages;

import org.openqa.selenium.By;

import com.mts.base.Page;

public class HomePage extends Page{

	
	public void goToCustomers() {
		
		driver.findElement(By.xpath("//a[@class='zh-customers']")).click();
	}
	
	public void goToSupport() {
		
		driver.findElement(By.xpath("//a[@class='zh-support']")).click();
	}
	
	public void goToContactSales() {
		
		driver.findElement(By.xpath("//a[@class='zh-contact']")).click();
	}
	
	public void goToSignUp() {
		
		driver.findElement(By.xpath("//a[@class='zh-signup']")).click();
	}
	
	public LoginPage goToLogin() {
		
		click("loginlink_XPATH");
		
		return new LoginPage();
	}
	
	public void goToLearnMore() {
		
		driver.findElement(By.xpath("//a[@class='learn-more']")).click();
	}
	
	public void validateFooterLinks() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Mobile Apps')]")).click();
	}
	
}
