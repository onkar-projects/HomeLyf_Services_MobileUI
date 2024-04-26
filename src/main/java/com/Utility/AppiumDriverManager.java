package com.Utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumDriverManager {
	static ReadConfig readconfig = new ReadConfig ();
	static String platform = readconfig.getPlatformName();
	static String device = readconfig.getDeviceName();
	static String automationname = readconfig.getAutomationName();
	public static Logger Logger = LogManager.getLogger(AppiumDriverManager.class);

	
	 public static AndroidDriver getDriver() throws MalformedURLException {
	        try {
	        	Logger = LogManager.getLogger("Starting VM Pixel_6a Mobile");
	    		DesiredCapabilities desiredCap = new DesiredCapabilities();
	    		desiredCap.setCapability("platformname", platform);
	    		desiredCap.setCapability("devicename", device);
	    		desiredCap.setCapability("automatorname", automationname);
	    		Logger.info("APK Downloaded Sucessfully");
	    		

	    		UiAutomator2Options options = new UiAutomator2Options();
	    		options.setApp(System.getProperty("user.dir") + "\\src\\test\\resources\\apk\\HomeLyf_Services.apk");

	    		// create object for AndroidDriver
	    		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    		return driver;
	        } catch (MalformedURLException e) {
	            Logger.error("Failed to initialize Appium driver: " + e.getMessage());
	            throw e; // Re-throw the exception for handling at a higher level
	        }
	    }
	}

