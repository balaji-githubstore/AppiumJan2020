package com.yesmsystem.nativeapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BasicCommands {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "pixel");
		cap.setCapability("platformName", "android");
		
		cap.setCapability("appPackage", "org.khanacademy.android");
		cap.setCapability("appActivity", "org.khanacademy.android.ui.library.MainActivity");
		
		cap.setCapability("noReset", true);
		cap.setCapability("autoLaunch", false);
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
		
		if(driver.isAppInstalled("org.khanacademy.android"))
		{
			driver.launchApp();
		}
		else
		{
			driver.installApp("D:\\Mine\\Company\\YesMSystem\\Devops&Appium-Jan2020\\AppiumConcept\\AppiumProject\\app\\Khan Academy_v6.2.1_apkpure.com (2).apk");
		}
		
		
	System.out.println(driver.getDeviceTime());
	System.out.println(driver.getCurrentPackage());
	System.out.println(driver.getContext());
	System.out.println(driver.currentActivity());
	
	System.out.println(driver.isKeyboardShown());
	driver.getKeyboard();
	System.out.println(driver.isKeyboardShown());
	if(driver.isKeyboardShown())
	{
		driver.hideKeyboard();
	}
	
		
	}
}
