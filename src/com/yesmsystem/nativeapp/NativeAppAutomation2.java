package com.yesmsystem.nativeapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class NativeAppAutomation2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "pixel");
		cap.setCapability("platformName", "android");
		
		cap.setCapability("appPackage", "org.khanacademy.android");
		cap.setCapability("appActivity", "org.khanacademy.android.ui.library.MainActivity");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//resource-id
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"org.khanacademy.android:id/tab_bar_button_profile\")").click();
		
		//text - Sign in
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Sign in\")").click();	
		//driver.findElementByAndroidUIAutomator("UiSelector().textContains(\"Sign\")").click();	
		
		//cont-desc
		driver.findElementByAndroidUIAutomator("UiSelector().description(\"Enter an e-mail address or username\")").sendKeys("bala@gmail.com");
		
		//driver.findElementByAndroidUIAutomator("UiSelector().descriptionContains(\"Enter an e-mail\")").sendKeys("bala@gmail.com");
		
		
		
		//xpath for cont-desc
		driver.findElementByAndroidUIAutomator("UiSelector().description(\"Password\")").sendKeys("!ew3333");
		Thread.sleep(3000);

		driver.findElementByAndroidUIAutomator("UiSelector().description(\"Sign in\")").click();
		

	}

}
