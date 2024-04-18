package com.pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInforCustomer_page {
	public AndroidDriver driver;

	@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Continue as a Customer\"])")
	private WebElement continue_as_a_customer;

	@AndroidFindBy(className = "(//android.widget.EditText)[2]")
	private WebElement Emailid;

	@AndroidFindBy(className = "(//android.widget.EditText)[3]")
	private WebElement Password;

	@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Sign In\"])")
	private WebElement Signintab;

	public SignInforCustomer_page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void LoginDetails() throws InterruptedException {

		continue_as_a_customer.click();
	}

}