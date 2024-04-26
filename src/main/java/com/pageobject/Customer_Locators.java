package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Customer_Locators {
	AndroidDriver driver;
	
	@AndroidFindBy(accessibility = "Continue as a Customer")
	WebElement Continue_as_a_customer_button;
	@AndroidFindBy(accessibility = "Don't have an account?")
	WebElement Dont_have_an_Account_linktext;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sign Up\"]")
	WebElement Sign_Up_Page_Heading;
	@AndroidFindBy(xpath = "//android.widget.EditText[1]")
	WebElement SignUp_Name_textbox;
	@AndroidFindBy(xpath = "//android.widget.EditText[2]")
	WebElement Signup_Email_textbox;
	@AndroidFindBy(xpath = "//android.widget.EditText[3]")
	WebElement Signup_Mobile_number_textbox;
	@AndroidFindBy(xpath = "//android.widget.EditText[4]")
	WebElement Signup_Password_textbox;
	@AndroidFindBy(xpath = "//android.widget.EditText[5]")
	WebElement Signup_Confirm_Password_textbox;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Sign Up\"]")
    WebElement Signup_Click_Button;
	@AndroidFindBy(accessibility = "Home Page")
	WebElement HomePage;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome!\"]")
	WebElement Welcome_Heading;
	@AndroidFindBy(accessibility = "Experience the Art of Homelyf Services, where comfort awaits you!")
	WebElement Welcome_Message;
	@AndroidFindBy(xpath = "//android.widget.EditText[1]")
	WebElement Signin_Emailid_textbox;
	@AndroidFindBy(xpath = "//android.widget.EditText[2]")
	WebElement Signin_Password_textbox;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Sign In\"]")
    WebElement Signin_Click_button;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"AccountTab 2 of 3\"]")
	WebElement Account_tab;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Log Out\"]")
	WebElement LogOut_Click_button;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Forgot Password?\"]")
	WebElement Forgot_Password_button;
	@AndroidFindBy(xpath = "//android.widget.EditText")
	WebElement Forgot_Password_EmailId_textbox;
	@AndroidFindBy(accessibility = "Send OTP")
	WebElement Send_OTP_button;
	@AndroidFindBy(xpath = "//android.widget.EditText[2]")
	WebElement OTP_textbox;
	@AndroidFindBy(xpath = "//android.widget.EditText[3]")
	WebElement New_Password_textbox;
	@AndroidFindBy(xpath = "//android.widget.EditText[4]")
	WebElement Confirm_Password_textbox;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Change Password\"]")
	WebElement Change_Password_button;
	
		public Customer_Locators(AndroidDriver driver) {
			this.driver = driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
//	public WebElement ClickonCoustomertab() {
//		return Continue_as_a_customer_button;
//	}
//	public WebElement Donthaveaccounttab() {
//		return Dont_have_an_Account_linktext;
//	}
//	public WebElement SignUpHeading() {
//		return Sign_Up_Page_Heading;
//	}
//	public WebElement SignupNameTextbox() {
//		return SignUp_Name_textbox;
//	}
//	public WebElement SignupEmailTextbox() {
//		return Signup_Email_textbox;
//	}
//	public WebElement SignupMobilenumberTextbox() {
//		return Signup_Mobile_number_textbox;
//	}
//	public WebElement SignupPasswordTextbox() {
//		return Signup_Password_textbox;
//	}
//	public WebElement SignupConfirmPasswordTextbox() {
//		return Signup_Confirm_Password_textbox;
//	}
//	public WebElement SignupClickButton() {
//		return Signup_Click_Button;
//	}
//	public WebElement HomePageHeading() {
//		return HomePage;
//	}
//	public WebElement WelcomeHeading() {
//		return Welcome_Heading;
//	}
//	public WebElement WelcomeMessage() {
//		return Welcome_Message;
//	}
//	public WebElement SigninEmailidTextbox() {
//		return Signin_Emailid_textbox;
//	}
//	public WebElement SigninPasswordTextbox() {
//		return Signin_Password_textbox;
//	}
//	public WebElement SigninClickButton() {
//		return Signin_Click_button;
//	}
//	public WebElement ForgotPasswordbutton() {
//		return Forgot_Password_button;
//	}
//	public WebElement ForgotPasswordEmailIdtextbox() {
//		return Forgot_Password_EmailId_textbox;
//	}
//	public WebElement SendOTPbutton() {
//		return Send_OTP_button;
//	}
//	public WebElement OTPtextbox() {
//		return OTP_textbox;
//	}
//	public WebElement NewPasswordtextbox() {
//		return New_Password_textbox;
//	}
//	public WebElement ConfirmPasswordtextbox() {
//		return Confirm_Password_textbox;
//	}
//	public WebElement ChangePasswordbutton() {
//		return Change_Password_button;
//	}
}
