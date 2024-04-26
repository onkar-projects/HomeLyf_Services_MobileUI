package com.base;

import java.net.MalformedURLException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Utility.AppiumDriverManager;
import com.Utility.AppiumServerManager;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.logging.log4j.*;

public class Base_Class {

	public static AndroidDriver driver;
	public AppiumDriverLocalService service;
	public static Logger Logger = LogManager.getLogger(Base_Class.class);

	 @BeforeClass
	    public void setUp() throws MalformedURLException {
	        AppiumServerManager.startAppiumServer();
	        driver = AppiumDriverManager.getDriver();
	    }

//	    @AfterClass
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	      
//	        }
	       
	    }

