package com.test;

import org.testng.annotations.Test;

import com.base.Base_Class;
import com.pageobject.ForgotPasswordforCustomer_page;
import com.pageobject.ForgotPasswordforPartner_page;
import com.pageobject.ResetPasswordforCustomer_page;
import com.pageobject.ResetPasswordforPartner_page;
import com.pageobject.SignInforCustomer_page;
import com.pageobject.SignInforPartner_page;
import com.pageobject.SignUpforCustomer_page;
import com.pageobject.SignUpforPartner_page;

import io.appium.java_client.android.AndroidDriver;

public class User extends Base_Class {
	public AndroidDriver driver;

	@Test
	public void Sign_up_with_valid_data() throws InterruptedException {
		SignUpforCustomer_page spc = new SignUpforCustomer_page(driver);
		spc.SignupDetails_Customer();
		
		SignUpforPartner_page spp = new SignUpforPartner_page(driver);
		spp.SignupDetails_Customer();
	}

	@Test
	public void Login_with_valid_data() throws InterruptedException {
		SignInforCustomer_page lpc = new SignInforCustomer_page(driver);
		lpc.LoginDetails();
		
		SignInforPartner_page lpp = new SignInforPartner_page(driver);
		lpp.LoginDetails();
	}

	@Test
	public void forgot_password_with_valid_data() {
		ForgotPasswordforCustomer_page fpc = new ForgotPasswordforCustomer_page(driver);
		fpc.forgotpassword();
		
		ForgotPasswordforPartner_page fpp = new ForgotPasswordforPartner_page(driver);
		fpp.forgotpassword();
	}
	
	@Test
	public void reset_password_with_valid_data() {
		ResetPasswordforCustomer_page rpc = new ResetPasswordforCustomer_page(driver);
		
		ResetPasswordforPartner_page rpp = new ResetPasswordforPartner_page(driver);
		
	}

}
