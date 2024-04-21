package com.Utility;

import java.time.Duration;

import org.openqa.selenium.NoAlertPresentException;
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
}
