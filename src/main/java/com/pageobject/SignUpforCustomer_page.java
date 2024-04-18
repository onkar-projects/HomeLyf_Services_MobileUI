package com.pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpforCustomer_page {
	AndroidDriver driver;

	@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Continue as a Customer\"])")
	private WebElement continue_as_a_customer_tab;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.android.packageinstaller:id/dialog_container\"])")
	private WebElement map_popup;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.packageinstaller:id/permission_deny_button\"]")
	private WebElement deny_location;
	//android.widget.Button[@resource-id="com.android.packageinstaller:id/permission_allow_button"] allow location
	
	@AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
	private WebElement click_on_signup;

	@AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
	private WebElement Name_tab;

	@AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
	private WebElement Email_tab;

	@AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
	private WebElement Mobile_num_tab;

	@AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
	private WebElement Password_tab;

	@AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
	private WebElement Confirm_Password;

	@AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
	private WebElement Signuptab;

	public SignUpforCustomer_page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void SignupDetails_Customer() throws InterruptedException {
		Thread.sleep(4000);
		continue_as_a_customer_tab.click();
		//Alert alt = new Alert (map_popup);
		//alt
		Thread.sleep(4000);
		deny_location.click();
		Thread.sleep(3000);
		click_on_signup.click();
		Name_tab.sendKeys("Missmani");
		Email_tab.sendKeys("monacoarise@gmail.com");
		Mobile_num_tab.sendKeys("5123456789");
		Password_tab.sendKeys("String123@");
		Confirm_Password.sendKeys("String123@");
		Signuptab.click();
	}
}