package Pages;

import actionHelper.AndroidHelperMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

class BasePageClass {
    protected AndroidDriver androidDriver;
    AndroidHelperMethods androidHelperMethods;

    public BasePageClass(AndroidDriver driver) {
        this.androidDriver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver, 15, TimeUnit.SECONDS), this);
        androidHelperMethods= new AndroidHelperMethods(androidDriver);
    }
}
