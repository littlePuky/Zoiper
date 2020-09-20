import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class incallElements {
    private static WebElement element;
    private static MobileElement mobileElement;

    public static MobileElement threeDots(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"More options\");"));
        return mobileElement;
    }

    public static WebElement incallLockIcon(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app:id/custom_menu_item_lock"));

        return element;
    }

    public static MobileElement holdCall(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Hold Call\");"));
        return mobileElement;
    }

    public static MobileElement callOnHold(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Local Hold\");"));
        return mobileElement;
    }

    public static MobileElement dialPad(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Dialpad\");"));
        return mobileElement;
    }

    public static MobileElement mute(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Mute\");"));
        return mobileElement;
    }

    public static MobileElement speaker(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Speaker\");"));
        return mobileElement;
    }

    public static MobileElement videoCall(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Video call\");"));
        return mobileElement;
    }

    public static MobileElement addCall(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Add call\");"));
        return mobileElement;
    }

    public static MobileElement onHold(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"On hold\");"));
        return mobileElement;
    }

    public static MobileElement callStat(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Call statistics\");"));
        return mobileElement;
    }

    public static WebElement interarrivalJitter(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app:id/currentOutgoingInterarrivalJitterMsValue"));

        return element;
    }

    public static WebElement currentPacketLoss(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app:id/currentPacketsLostPermilValue"));

        return element;
    }

    public static MobileElement recordCall(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Call record\");"));
        return mobileElement;
    }

    public static MobileElement indicatorRecordCall(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"RECORDING\");"));
        return mobileElement;
    }

    public static MobileElement stopRecording(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Stop recording\");"));
        return mobileElement;
    }

    public static MobileElement transferCall(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Transfer call\");"));
        return mobileElement;
    }

    public static MobileElement indicatorTransferCall(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Transferring to 1111\");"));
        return mobileElement;
    }

    public static MobileElement endVideoCall(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Audio call\");"));
        return mobileElement;
    }

    public static WebElement videoCallDisplay(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app:id/videoCallViews"));

        return element;
    }

    public static MobileElement mergeCalls(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Merge calls\");"));
        return mobileElement;
    }

    public static MobileElement manageConferenceCall(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Manage conference call\");"));
        return mobileElement;
    }

}