package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyPage extends BasePageClass {

    public BuyPage(AndroidDriver driver) {
        super(driver);
    }

    public static final String AUTOSEARCH = "com.nobroker.app:id/localityAutoCompleteTxt";
    public static final String SEARCH_ICON = "com.nobroker.app:id/searchImageSearch";
    public static final String THREEBHK = "com.nobroker.app:id/bhkthree";
    public static final String TWOBHK = "com.nobroker.app:id/bhktwo";
    public static final String Search_Property = "com.nobroker.app:id/searchProperty";


    @AndroidFindBy(id = AUTOSEARCH)
    MobileElement autoSearch;

    @AndroidFindBy(id = SEARCH_ICON)
    MobileElement search_icon;

    @AndroidFindBy(id = THREEBHK)
    MobileElement threebhk;

    @AndroidFindBy(id = TWOBHK)
    MobileElement twobhk;

    @AndroidFindBy(id = Search_Property)
    MobileElement search_Property;


    public void enterAutoSearch(String localities) throws Exception {
        androidHelperMethods.WaittillVisible(autoSearch);
        androidHelperMethods.inputValuesSlowly(autoSearch, localities);
        androidDriver.hideKeyboard();
    }

    public void click_three_Bhk() {
        androidHelperMethods.click(threebhk);
    }

    public void click_two_Bhk() {
        androidHelperMethods.click(twobhk);
    }

    public void search_Property() {
        androidHelperMethods.click(search_Property);
    }
}
