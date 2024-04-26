package com.pageobject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ExcelSheet;
import com.Utility.Library;
import com.base.Base_Class;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInforCustomer_page extends Base_Class {
	AndroidDriver driver;
    Library lb = new Library();
	Customer_Locators wb;
	public static Logger Logger = LogManager.getLogger(SignInforCustomer_page.class);

	public SignInforCustomer_page(AndroidDriver driver) {
		this.driver = driver;
		wb = new Customer_Locators(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public Library Customer_signInDetails(String email, String password) throws InterruptedException, IOException {
		
		//wb.Continue_as_a_customer_button.click();
		lb.custom_Click(wb.Continue_as_a_customer_button, "Continue_as_a_customer");
		
		lb.isAlertPresent();
		lb.acceptAlert();
		boolean welcometitle = wb.Welcome_Heading.isDisplayed();
		System.out.println("Welcome title is present " + welcometitle);
		Logger.info("Welcome title is present");

		boolean Welcometitlmessage = wb.Welcome_Message.isDisplayed();
		System.out.println("Welcome Message is present " + Welcometitlmessage);
		Logger.info("Welcome Message is present");

		wb.Signin_Emailid_textbox.click();
//		String name = ExcelSheet.getDataProviderExcelSheet(1, 1);
//		wb.Signin_Emailid_textbox.sendKeys(ExcelSheet.getDataProviderExcelSheet(1, 1));
		lb.enterText(wb.Signin_Emailid_textbox, email);
		
		wb.Signin_Password_textbox.click();
//		String password = ExcelSheet.getDataProviderExcelSheet(1, 3);
//		wb.Signin_Password_textbox.sendKeys(ExcelSheet.getDataProviderExcelSheet(1, 3));
		lb.enterText(wb.Signin_Password_textbox, password);
		
		//wb.Signin_Click_button.click();
		lb.custom_Click(wb.Signin_Click_button, "SignIn");
		
		Logger.info("Customer Signed In Successfully.");
		//lb.explicitWait(driver, wb.Signin_Click_button, 20);
//		
//		lb.explicitWait(driver, wb.HomePage, 20);
//		Logger.info("Customer redirected to HomePage Successfully.");

//		lb.explicitWait(driver, homePage, 20);
//		String msg = homePage.getText();
//		System.out.println("Home page message: "+ msg);
	return lb;	
	}

//	public String chkHomePageOnSignIn() {
//		String msg = homePage.getText();
//		System.out.println("Home page message: "+ msg);
//		return msg;
//		
//	}

}