package com.yesmsystem.webapps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class WebAppTest {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "pixel");
		cap.setCapability("platformName", "android");
		cap.setCapability("browserName", "chrome");
		cap.setCapability("chromedriverExecutable", "D:\\Mine\\Company\\YesMSystem\\Devops&Appium-Jan2020\\AppiumConcept\\AppiumProject\\driver\\chromedriver.exe");
		
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://facebook.com");
		
		driver.findElementByXPath("//*[@id='m_login_email']").sendKeys("bala@gmail.com");
		
		driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("king@123"); //input[@placeholder='Password']
		
		//tagname[@att='']
		
		driver.findElementByXPath("//button[@value='Log In']").click();
	}

}
