package com.pageobject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ResetPasswordforPartner_page {

public AndroidDriver driver;
	
	public ResetPasswordforPartner_page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);}

	
public void resetpassword() {
		
		
		
		
	}
}
