package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties properties;
	String path = "C:\\Users\\monik\\eclipse-workspace\\appium\\HomeLyf_Services_MobileUI\\Configuration\\config.properties";

	public ReadConfig() {
		properties = new Properties();
		try {

			FileInputStream ip = new FileInputStream(path);
			properties.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getPlatformName() {
		String PlatformNamevalue = properties.getProperty("PLATFORM_NAME");
		if (PlatformNamevalue != null)
			return PlatformNamevalue;
		else
			throw new NullPointerException("PlatformName is not specified");
	}

	public String getDeviceName() {
		String DeviceNamevalue = properties.getProperty("PLATFORM_NAME");
		if (DeviceNamevalue != null)
			return DeviceNamevalue;
		else
			throw new NullPointerException("DeviceName is not specified");

	}

	public String getAutomationName() {
		String AutomationNamevalue = properties.getProperty("AUTOMATION_NAME");
		if (AutomationNamevalue != null)
			return AutomationNamevalue;
		else
			throw new NullPointerException("AutomationName is not specified");

	}

}
