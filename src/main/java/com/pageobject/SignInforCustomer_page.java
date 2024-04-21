package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignInforCustomer_page extends Base_Class {

	@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc='Continue as a Customer'])")
	 WebElement continue_as_a_customer;

	@AndroidFindBy(className = "(//android.widget.EditText)[2]")
	 WebElement Emailid;

	@AndroidFindBy(className = "(//android.widget.EditText)[3]")
	 WebElement Password;

	@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Sign In\"])")
	 WebElement Signintab;

	public SignInforCustomer_page(AndroidDriver driver) {
     	this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void LoginDetails() throws InterruptedException {

		continue_as_a_customer.click();
	}

}