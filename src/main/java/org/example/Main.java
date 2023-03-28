package org.example;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class Main {

    @Test
    public void AppiumTest() throws MalformedURLException
    {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setUdid("192.168.1.6:36673");
//        options.setUdid("emulator-5554");
        options.setAppPackage("com.VoDrive.debug");
//		options.setAppActivity("in.vogo.sdk.base.BaseActivity");
        options.setPlatformVersion("13");
        options.setApp("/Users/sahilchugh/downloads/VogoLite 1703.apk");
        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
    }
}