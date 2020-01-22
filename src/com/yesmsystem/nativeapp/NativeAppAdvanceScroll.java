package com.yesmsystem.nativeapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import net.jcip.annotations.Immutable;

public class NativeAppAdvanceScroll {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "pixel");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "android");
		
		cap.setCapability("appPackage", "org.khanacademy.android");
		cap.setCapability("appActivity", "org.khanacademy.android.ui.library.MainActivity");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
		while(driver.findElementsByAndroidUIAutomator("UiSelector().text(\"Computing\")").size()==0)
		{
			//scroll
			driver.executeScript("mobile:shell", ImmutableMap.of("command","input touchscreen swipe 1009 1200 1015 1015"));
		}
	
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Computing\")").click();
		
		driver.findElementByAndroidUIAutomator("UiSelector().textContains(\"AP\")").click();
		
		while(driver.findElementsByAndroidUIAutomator("UiSelector().text(\"Algorithms\")").size()==0)
		{
			//scroll
			driver.executeScript("mobile:shell", ImmutableMap.of("command","input touchscreen swipe 1009 1200 1015 1015"));
		}
	
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Algorithms\")").click();
		
		
	}

}
