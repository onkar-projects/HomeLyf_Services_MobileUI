package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Library;
import com.base.Base_Class;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpforCustomer_page extends Base_Class {
	Library lb = new Library();

	@AndroidFindBy(accessibility = "Continue as a Customer")
	WebElement continue_as_a_customer;
	@AndroidFindBy(accessibility = "Don't have an account?")
	WebElement clickforsignup;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Sign Up\"]") 
	WebElement signupheadline;
	@AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
	WebElement Name_tab;
	@AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
	WebElement Email_tab;
	@AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
	WebElement Mobile_num_tab;
	@AndroidFindBy(xpath = "(//android.widget.EditText)[4]")
	WebElement Password_tab;
	@AndroidFindBy(xpath = "(//android.widget.EditText)[5]")
	WebElement Confirm_Password;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Sign Up\"]")
	WebElement Signuptab;	
	

	public SignUpforCustomer_page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);}

	public void SignupDetails_Customer() throws InterruptedException {

		continue_as_a_customer.click();
		lb.acceptAlert();
		clickforsignup.click();
		boolean signupheading= signupheadline.isDisplayed();
		System.out.println("SignUp heading is present = "+ signupheading);
		Thread.sleep(3000);
		Name_tab.sendKeys("Master Blaster");
		Thread.sleep(3000);
		Email_tab.sendKeys("masterblaster@gmail.com");
		Thread.sleep(3000);
		Mobile_num_tab.sendKeys("4532174309");
		Thread.sleep(3000);
		Password_tab.sendKeys("String@123");
		Thread.sleep(3000);
		//checkpassword.click();
		Thread.sleep(3000);
		Confirm_Password.sendKeys("String@123");
		Thread.sleep(3000);
		//checkconfirmpassword.click();
		Thread.sleep(3000);
		Signuptab.click();
		Thread.sleep(3000);

		
		
		
	}}