package DriverManager;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import util.utility;

import java.util.Properties;
import java.net.URL;

public class DriverManager {
    static Properties properties;
    public static AndroidDriver driver;
    static DesiredCapabilities capabilities;

    public static WebDriver getDriver(DriverManagerType browserName) throws Exception {
        switch (browserName.getDriver()) {
            case "AndroidDriver":
                String propertyPath = System.getProperty("user.dir") + "//src//main//resources//android.properties";
                return driver = new AndroidDriverManager().getAndroidDriver(propertyPath);

        }
        return null;
    }

}
