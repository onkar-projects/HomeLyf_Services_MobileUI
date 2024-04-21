package com.test;

import org.testng.annotations.Test;
import com.base.Base_Class;
import com.pageobject.ForgotPasswordforCustomer_page;
import com.pageobject.ResetPasswordforCustomer_page;
import com.pageobject.SignInforCustomer_page;
import com.pageobject.SignUpforCustomer_page;

public class Customer extends Base_Class {
		
	@Test
	public void Sign_up_with_valid_data() throws InterruptedException {
		SignUpforCustomer_page spc = new SignUpforCustomer_page(driver);
		spc.SignupDetails_Customer();
	
	}

	@Test
	public void Login_with_valid_data() throws InterruptedException {
		SignInforCustomer_page lpc = new SignInforCustomer_page(driver);
		lpc.LoginDetails();
		
	}

	@Test
	public void forgot_password_with_valid_data() {
		ForgotPasswordforCustomer_page fpc = new ForgotPasswordforCustomer_page(driver);
		fpc.forgotpassword();
		}
	
	@Test
	public void reset_password_with_valid_data() {
		ResetPasswordforCustomer_page rpc = new ResetPasswordforCustomer_page(driver);
		
	}

}
