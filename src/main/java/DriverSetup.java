import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverSetup {

    AndroidDriver<AndroidElement> driver;

    @BeforeTest
    void setUp() throws MalformedURLException {
        System.out.println("Fresh Start");
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, zoiperElements.androidVersion);
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Huawei");
        dc.setCapability(MobileCapabilityType.APP, zoiperElements.apkPath);
        dc.setCapability("autoGrantPermissions", true);
        URL url = new URL(zoiperElements.appiumAddress);
        driver = new AndroidDriver<>(url, dc);
    }
}