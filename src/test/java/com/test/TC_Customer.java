package com.test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Utility.DataProviderClass;
import com.base.Base_Class;

import com.pageobject.ForgotPasswordforCustomer_page;
import com.pageobject.SignInforCustomer_page;
import com.pageobject.SignUpforCustomer_page;

public class TC_Customer extends Base_Class {
	
		
	@Test(priority=1, description = "Customer SignUp with valid data" , dataProvider = "CustomerSignupvaliddata", dataProviderClass = DataProviderClass.class)
	public void TC_001_Customer_Sign_up(String name, String emailid, String number, String password, String confirmpassword) throws InterruptedException {
		SignUpforCustomer_page spc = new SignUpforCustomer_page(driver);
		spc.Customer_signupDetails(name, emailid, number, password, confirmpassword);
	}

	@Test(priority=2, description = "Customer SignIn with valid data", dataProvider ="CustomerSigninvaliddata", dataProviderClass = DataProviderClass.class)
	public void TC_002_Customer_Signin(String email, String password) throws InterruptedException, IOException {
		SignInforCustomer_page lpc = new SignInforCustomer_page(driver);
		lpc.Customer_signInDetails(email, password);
	}

	@Test(priority=3)//, description = "Customer Forgot Password with valid data", dataProvider = "emailforforgotpassword", dataProviderClass = DataProviderClass.class)
	public void TC_003_Customer_forgot_password() throws InterruptedException {
		ForgotPasswordforCustomer_page fpc = new ForgotPasswordforCustomer_page(driver);
		fpc.forgotPassword();
		}
}
