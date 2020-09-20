import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class accountsSettings {
    private static WebElement element;
    private static MobileElement mobileElement;

    public static String presenceStatusListClass = "android.widget.LinearLayout";

    public static MobileElement defaultAccountSelect(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"" + zoiperElements.defaultAccNumber + "@" + zoiperElements.hostAddress + "\");"));
        return mobileElement;
    }

    public static MobileElement locked(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().resourceId(\"com.zoiper.android.zoiperbeta.app:id/codec_lock\");"));
        return mobileElement;
    }

    public static MobileElement videoCodecSettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Video Codec Settings\"));"));
        return mobileElement;
    }

    public static MobileElement audioCodecSettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Audio Codec Settings\"));"));
        return mobileElement;
    }

    public static MobileElement opusSuper(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Opus super\"));"));
        return mobileElement;
    }

    public static MobileElement encryption(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Encryption Settings\"));"));
        return mobileElement;
    }

    public static MobileElement enableSubscribePresence(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Enable Subscribe Presence\"));"));
        return mobileElement;
    }

    public static MobileElement enablePublishPresence(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Enable Publish Presence\"));"));
        return mobileElement;
    }

    public static MobileElement ringtoneSettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Ringtone\"));"));
        return mobileElement;
    }

    public static MobileElement hostSettings(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Host\"));"));
        return mobileElement;
    }

    public static WebElement SIPaccSettings(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app:id/my_toolbar"));

        return element;
    }

    public static WebElement setPresence(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app:id/set_presence"));

        return element;
    }

}
