package com.base;

import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base_Class {
public AndroidDriver driver;
public AppiumDriverLocalService service;
 @BeforeClass
 public void configureAppium() throws MalformedURLException{
	 //run appium server automatically
	 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\monik\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
			 .withIPAddress("127.0.0.1").usingPort(4723).build();
	 service.start();
	 
	 
	 //create capabilities
	 DesiredCapabilities desiredCap = new DesiredCapabilities();
		desiredCap.setCapability("platform", "Android");
		desiredCap.setCapability("device","Pixel_6a");
		desiredCap.setCapability("automationName","uiautomator2");
		
	 UiAutomator2Options options = new UiAutomator2Options();
	 options.setApp(System.getProperty("user.dir")+"\\src\\test\\resources\\apk\\Homelyf.apk");
	
	 // create object for AndroidDriver
	 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 //driver.findElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Continue as a Customer\"])")).click();
 }
 
 
//@AfterClass
//public void TearDown() {
//	 driver.quit();
//	 service.stop();
// }
}
