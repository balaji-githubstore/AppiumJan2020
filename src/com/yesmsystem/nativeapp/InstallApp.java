package com.yesmsystem.nativeapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class InstallApp {

	public static void main(String[] args) throws MalformedURLException {	
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "pixel");
		cap.setCapability("platformName", "android");
		
		cap.setCapability("app", "D:\\Mine\\Company\\YesMSystem\\Devops&Appium-Jan2020\\AppiumConcept\\AppiumProject\\app\\Khan Academy_v6.2.1_apkpure.com (2).apk");
		
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}

}
