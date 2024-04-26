package com.Utility;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumServerManager {
	
	private static final Logger Logger = LogManager.getLogger(AppiumServerManager.class);
    private static AppiumDriverLocalService service;

    public static void startAppiumServer() {
        AppiumServiceBuilder builder;
        service = new AppiumServiceBuilder().withAppiumJS(
						new File("C:\\Users\\monik\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
	
        service.start();
        Logger.info("Appium server started successfully.");
    }

    public static void stopAppiumServer() {
        if (service != null && service.isRunning()) {
            service.stop();
            Logger.info("Appium server stopped successfully.");
        }
    }
}

