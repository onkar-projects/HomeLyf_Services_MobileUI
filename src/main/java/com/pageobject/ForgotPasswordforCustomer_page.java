package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ForgotPasswordforCustomer_page {
public AndroidDriver driver;
@AndroidFindBy(xpath="(//android.widget.Button[@content-desc=\"Continue as a Customer\"])") 
private WebElement continue_as_a_customer;

@AndroidFindBy(xpath="") private WebElement click_forgot_password;

@AndroidFindBy(xpath="") private WebElement Emailid;

@AndroidFindBy(xpath="") private WebElement send_otp_tab;

@AndroidFindBy(xpath="") private WebElement Back_to_signin;

public ForgotPasswordforCustomer_page(AndroidDriver driver) {
	this.driver = driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);}

public void forgotpassword() {
	continue_as_a_customer.click();
	click_forgot_password.click();
	Emailid.sendKeys("monacoarise@gmail.com");
	send_otp_tab.click();
	Back_to_signin.click();
}
}
