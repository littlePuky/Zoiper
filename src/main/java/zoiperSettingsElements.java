import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class zoiperSettingsElements {
    private static WebElement element;
    private static MobileElement mobileElement;

    public static MobileElement connectivity(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Connectivity\");"));
        return mobileElement;
    }

    public static WebElement lockIcon(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app:id/premium_lock"));

        return element;
    }

    public static WebElement devLockIcon(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app.dev:id/premium_lock"));

        return element;
    }

    public static WebElement codecLockIcon(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app:id/codec_lock"));

        return element;
    }

    public static WebElement devCodecLockIcon(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app.dev:id/codec_lock"));

        return element;
    }

    public static MobileElement upgradePopup(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Upgrade to Combo Pack\");"));
        return mobileElement;
    }

    public static MobileElement customize(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Customize\");"));
        return mobileElement;
    }

    public static MobileElement calls(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Calls\");"));
        return mobileElement;
    }

    public static MobileElement accounts(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Accounts\");"));
        return mobileElement;
    }

    public static MobileElement autoAnswer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Auto Answer Incoming Calls\");"));
        return mobileElement;
    }

    public static MobileElement instantAnswer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Instant Auto Answer\");"));
        return mobileElement;
    }

    public static MobileElement keepSettingsAfterRestart(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Keep Settings After Restart\");"));
        return mobileElement;
    }

    public static MobileElement exitButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Exit\"));"));
        return mobileElement;
    }

}