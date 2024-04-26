package com.Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Base_Class;

public class Library extends Base_Class {

	public boolean isAlertPresent() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			throw e;
		}
	}

	public void dismissAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
	}

	public void acceptAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}

	public void explicitWait(WebDriver driver, WebElement element, int timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	WebElement waitForElement(WebElement locator) {
		WebDriverWait wait1 = new WebDriverWait(null, null);
		return wait1.until(ExpectedConditions.visibilityOfElementLocated((By) locator));
	}

	public void custom_Click(WebElement elementlocator, String fieldname) {
		try {
			elementlocator.click();
			System.out.println("Clicked Successfully on :" + fieldname);
		} catch (Exception e) {
			System.out.println("Unable to click" + e);
		}
	}

	public void enterText(WebElement locator, String text) {
		try {
			locator.click();
			locator.sendKeys(text);
			Logger.info("Entered text: " + text + " into element with locator: " + locator.toString());
		} catch (Exception e) {
			System.out.println("Unable to send value" + e);
		}
	}

}
