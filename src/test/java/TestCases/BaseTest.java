package TestCases;


import DriverManager.DriverManagerType;
import DriverManager.WebDrivers;
import Pages.BuyPage;
import Pages.HomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import util.utility;

import java.util.Properties;

public class BaseTest {


    static WebDriver driver;
    HomePage homePage;
    BuyPage buyPage;

    @BeforeSuite
    public void setUp() {
        try {
            driver = WebDrivers.getDriver(DriverManagerType.ANDROID);
            homePage = new HomePage((AndroidDriver)driver);
            buyPage = new BuyPage((AndroidDriver)driver);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterSuite
    public void destroyDriver() {
        //  driver.quit();
    }
}