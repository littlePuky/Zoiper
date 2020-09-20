import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class settingsMenuElements {
    private static WebElement element;
    private static MobileElement mobileElement;
    public static String accStatusId = "com.zoiper.android.app:id/accountStatus";

    public static MobileElement accountsSettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Accounts\");"));
        return mobileElement;
    }

    public static MobileElement audioSettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Audio\");"));
        return mobileElement;
    }

    public static MobileElement videoSettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Video\");"));
        return mobileElement;
    }

    public static MobileElement connectivitySettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Connectivity\");"));
        return mobileElement;
    }

    public static MobileElement customizeSettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Customize\");"));
        return mobileElement;
    }

    public static MobileElement contactsSettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Contacts\");"));
        return mobileElement;
    }

    public static MobileElement callsSettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Calls\");"));
        return mobileElement;
    }

    public static MobileElement advancedSettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Advanced\"));"));
        return mobileElement;
    }

    public static MobileElement bluetoothSettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Bluetooth\"));"));
        return mobileElement;
    }

    public static MobileElement listeningPorts(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Listening Ports\"));"));
        return mobileElement;
    }

    public static MobileElement sortOrder(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Sort Order\");"));
        return mobileElement;
    }

    public static MobileElement nameFormat(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Name Format\");"));
        return mobileElement;
    }

    public static MobileElement contactSources(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Contacts sources\");"));
        return mobileElement;
    }

    public static MobileElement clearFrequentlyCalled(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Clear Frequently Called\");"));
        return mobileElement;
    }

    public static MobileElement clearPinnedContacts(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Clear Pinned Contacts\");"));
        return mobileElement;
    }

    public static MobileElement firstName(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"First name\");"));
        return mobileElement;
    }

    public static MobileElement lastName(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Last name\");"));
        return mobileElement;
    }

    public static MobileElement firstFirstName(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"First name first\");"));
        return mobileElement;
    }

    public static MobileElement firstLastName(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Last name first\");"));
        return mobileElement;
    }

    public static MobileElement pickATheme(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Pick A Theme\");"));
        return mobileElement;
    }

    public static MobileElement themeTwo(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"2\");"));
        return mobileElement;
    }

    public static WebElement applyTheme(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.app:id/apply_theme"));
        return element;
    }

    public static WebElement cancelButton(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.app:id/negButton"));
        return element;
    }

    public static MobileElement currentTheme(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"CURRENT\");"));
        return mobileElement;
    }

    public static MobileElement defaultTheme(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"DEFAULT\");"));
        return mobileElement;
    }

    public static MobileElement supportedNetworks(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Supported Networks\");"));
        return mobileElement;
    }

    public static MobileElement Wifi(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Wifi\");"));
        return mobileElement;
    }

    public static MobileElement twoG(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"2G\");"));
        return mobileElement;
    }

    public static MobileElement threeG(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"3G\");"));
        return mobileElement;
    }

    public static MobileElement fourG(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"4G\");"));
        return mobileElement;
    }

}
