package org.example;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class Main {

    @Test
    public void AppiumTest() throws MalformedURLException, InterruptedException
    {
//		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/index.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();

//        File path = new File("/Users/sahilchugh/downloads/VogoLite.apk");
//        DesiredCapabilities desiredCapabilities =  new DesiredCapabilities();
//        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 33");
//        desiredCapabilities.setCapability(MobileCapabilityType.APP, path.getAbsolutePath());
//
//        AndroidDriver androidDriver = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"), desiredCapabilities);
//        androidDriver.launchApp();
//        Thread.sleep(200000);
//        androidDriver.quit();

        UiAutomator2Options options = new UiAutomator2Options();
//        options.setUdid("adb-RZCT41D13SM-prLmQW._adb-tls-connect._tcp.");
        options.setUdid("emulator-5554");
        options.setAppPackage("com.VoDrive.debug");
//		options.setAppActivity("in.vogo.sdk.base.BaseActivity");
        options.setPlatformVersion("13");
        options.setApp("/Users/sahilchugh/downloads/VogoLite 1703.apk");
        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
//        Thread.sleep(200000);
//        driver.quit();
////		service.stop();


//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
//        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 33");
//        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/sahilchugh/downloads/VogoLite 1703.apk");
//
//        AppiumDriver appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
////        androidDriver.launchApp();
    }
}