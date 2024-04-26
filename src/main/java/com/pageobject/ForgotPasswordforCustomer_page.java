package com.pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Library;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class ForgotPasswordforCustomer_page {
	public AndroidDriver driver;
	public static Logger Logger = LogManager.getLogger(ForgotPasswordforCustomer_page.class);

	Library lb = new Library();
	@AndroidFindBy(accessibility = "Continue as a Customer")
	WebElement continue_as_a_customer;
	
//	@AndroidFindBy(accessibility = "Forgot Password?")
//	WebElement clickon_forgot_password;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Forgot Password?']")
	WebElement clickon_forgot_password;
	
//	@AndroidFindBy(xpath = "//android.widget.EditText")
	WebElement Emailid;
	@AndroidFindBy(accessibility = "Send OTP")
	WebElement send_otp_tab;
	@AndroidFindBy(xpath = "//android.widget.EditText[2]")
	WebElement OTP_textbox;
	@AndroidFindBy(xpath = "//android.widget.EditText[3]")
	WebElement New_Password_textbox;
	@AndroidFindBy(xpath = "//android.widget.EditText[4]")
	WebElement Confirm_Password_textbox;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Change Password\"]")
	WebElement Change_Password_tab;

	public ForgotPasswordforCustomer_page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	}

	@SuppressWarnings("deprecation")
	public void forgotPassword() throws InterruptedException {
		continue_as_a_customer.click();
		lb.isAlertPresent();
		lb.acceptAlert();
		TouchAction touchAction = new TouchAction(driver);
//		TapOptions tapOptions = new TapOptions();
//		tapOptions.withElement(ElementOption.element(clickon_forgot_password)).withTapsCount(2)
		  Point location = clickon_forgot_password.getLocation();
		touchAction.tap(PointOption.point(location.x, location.y)).perform();
//		lb.explicitWait(driver, clickon_forgot_password, 20);
//		clickon_forgot_password.click();
//		lb.explicitWait(driver, clickon_forgot_password,20);
		Emailid.click();
		Emailid.sendKeys("mkoganur95@gmail.com");
		lb.explicitWait(driver, send_otp_tab, 30);
		send_otp_tab.click();
		lb.explicitWait(driver, OTP_textbox, 30);
		Logger.info("OTP Send to Email id Successfully.");
		OTP_textbox.click();
		lb.explicitWait(driver, OTP_textbox, 30);
		OTP_textbox.sendKeys("GHVDEIBR");
		lb.explicitWait(driver, New_Password_textbox, 30);
		New_Password_textbox.click();
		New_Password_textbox.sendKeys("Nobita123@");
		Confirm_Password_textbox.click();
		Confirm_Password_textbox.sendKeys("Nobita123@");
		Change_Password_tab.click();
		Logger.info("Password Reset Successfully.");
	}
}
