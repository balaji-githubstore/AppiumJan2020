package com.yesmsystem.nativeapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import net.jcip.annotations.Immutable;

public class NativeAppAdvanceTouch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "pixel");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "android");
		
		cap.setCapability("appPackage", "org.khanacademy.android");
		cap.setCapability("appActivity", "org.khanacademy.android.ui.library.MainActivity");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
		Thread.sleep(5000);
		//io.appium.java_client.TouchAction;
		TouchAction action=new TouchAction(driver);
		
		//action.tap(PointOption.point(559,1229)).perform();
		
		action.tap(TapOptions.tapOptions()
				.withElement(ElementOption
						.element(driver.findElementByAndroidUIAutomator("UiSelector().text(\"Sign in\")")))
				.withTapsCount(5)).perform();
		
		action.longPress(PointOption.point(100,500)).perform();
		
		
	}

}
