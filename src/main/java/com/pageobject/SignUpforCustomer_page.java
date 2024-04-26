package com.pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.Utility.Library;
import com.base.Base_Class;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpforCustomer_page extends Base_Class {
	Library lb = new Library();
	AndroidDriver driver;
	Customer_Locators wb;
	public static Logger Logger = LogManager.getLogger(SignUpforCustomer_page.class);

	public SignUpforCustomer_page(AndroidDriver driver) {
		this.driver = driver;
		wb = new Customer_Locators(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
    

	public Library Customer_signupDetails(String name, String emailid, String number, String password, String confirmpassword) {
		    lb.custom_Click(wb.Continue_as_a_customer_button, "continue_as_a_customer");
			lb.acceptAlert();
			lb.custom_Click(wb.Dont_have_an_Account_linktext, "Don't have an Account");
//			boolean signupheading = wb.Sign_Up_Page_Heading.isDisplayed();
//			System.out.println("SignUp heading is present = " + signupheading);
//			Logger.info("SignUp heading is present");
			
			wb.SignUp_Name_textbox.click();
			lb.enterText(wb.SignUp_Name_textbox, name);
			
			lb.explicitWait(driver, wb.Signup_Email_textbox, 20);
			wb.Signup_Email_textbox.click();
			lb.enterText(wb.Signup_Email_textbox, emailid);
			
			lb.explicitWait(driver, wb.Signup_Mobile_number_textbox, 20);
			lb.enterText(wb.Signup_Mobile_number_textbox, number );
			
			lb.explicitWait(driver, wb.Signup_Password_textbox, 20);
			wb.Signup_Password_textbox.click();
			lb.enterText(wb.Signup_Password_textbox, password);
			
			lb.explicitWait(driver, wb.Signup_Confirm_Password_textbox, 20);
			wb.Signup_Confirm_Password_textbox.click();
			lb.enterText(wb.Signup_Confirm_Password_textbox, confirmpassword);

			lb.explicitWait(driver, wb.Signup_Click_Button, 20);
			lb.custom_Click(wb.Signup_Click_Button, "Signup");
			
			//toast message to generate toast message uses tag name = android.widget.Toast
			
//			lb.explicitWait(driver, wb.HomePage, 20);
//			boolean homepagedisplay = wb.HomePage.isDisplayed();
//			System.out.println("HomePage is present = " + homepagedisplay);
			Logger.info("Customer Signed Up Successfully.");

			Logger.info("Customer redirected to HomePage Successfully.");
            
		 return lb;
	}
}