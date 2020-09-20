import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class phoneElements {
    private static WebElement element;
    private static MobileElement mobileElement;

    public static MobileElement playStore(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Play Store\");"));
        return mobileElement;
    }

    public static WebElement playStoreNavDrawer(AndroidDriver<AndroidElement> driver) {
//        element = driver.findElement(By.id("com.android.vending:id/main_nav_item_burger"));
//
//        return element;
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Show navigation drawer\");"));
        return mobileElement;

    }

    public static MobileElement subscriptionsPlayStore(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Subscriptions\");"));
        return mobileElement;
    }

    public static MobileElement zoiperSubscriptionPlayStore(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Test: Zoiper IAX SIP VOIP Softphone\");"));
        return mobileElement;
    }

    public static MobileElement openAppPlayStore(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Open app\");"));
        return mobileElement;
    }

    public static MobileElement cancelSubscriptionButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Cancel subscription\"));"));
        return mobileElement;
    }

    public static MobileElement declineToAnswer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Decline to answer\");"));
        return mobileElement;
    }

    public static MobileElement continueButtonDeclineToAnswer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"CONTINUE\");"));
        return mobileElement;
    }

    public static MobileElement confirmCancelSubButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"CANCEL SUBSCRIPTION\");"));
        return mobileElement;
    }

    public static MobileElement gmail(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Gmail\");"));
        return mobileElement;
    }

    public static MobileElement zoiperEmail(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"<android@zoiper.com>, \");"));
        return mobileElement;
    }

    public static WebElement attachment(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.google.android.gm:id/attachment_tile_title"));

        return element;
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

    public static MobileElement z1Contact(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"z 1\"));"));
        return mobileElement;
    }

    public static WebElement searchContact(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.android.contacts:id/search_view"));

        return element;
    }

    public static MobileElement facebookLink(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"m.facebook.com/login.php?next=https%3A%2F%2Fm.facebook.com%2FZoiper&refsrc=https%3A%2F%2Fm.facebook.com%2FZoiper&_rdr\");"));
        return mobileElement;
    }

    public static MobileElement twitterLink(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"mobile.twitter.com/Zoiper\");"));
        return mobileElement;
    }

    public static MobileElement zoiperWebsiteLink(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"zoiper.com\");"));
        return mobileElement;
    }

}