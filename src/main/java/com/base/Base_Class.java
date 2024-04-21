package com.base;

import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base_Class {

	public static AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	  @BeforeClass
	public AndroidDriver configureAppium() throws MalformedURLException, InterruptedException {
		  
		// run appium server automatically
		System.out.println(" Launching Appium Server");
		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\monik\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();

		// create capabilities
		System.out.println("Starting VM Pixel_6a Mobile");
		DesiredCapabilities desiredCap = new DesiredCapabilities();
		desiredCap.setCapability("platform", "Android");
		desiredCap.setCapability("device", "Pixel_6a");
		desiredCap.setCapability("automationName", "uiautomator2");
		System.out.println("APK Downloaded Sucessfully");
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setApp(System.getProperty("user.dir") + "\\src\\test\\resources\\apk\\Homelyf.apk");

		// create object for AndroidDriver
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 return driver;
	}

//@AfterClass
//public void TearDown() {
//	 driver.quit();
//	 service.stop();
// }
}
