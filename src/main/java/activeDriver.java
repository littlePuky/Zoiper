import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class activeDriver {

    AndroidDriver<AndroidElement> driver;

    @BeforeClass
    void setUp() throws MalformedURLException {
        System.out.println("Activating driver, start Zoiper manually!");
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, zoiperElements.androidVersion);
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Huawei");
        dc.setCapability("appActivity", "com.zoiper.android.app");
        dc.setCapability("autoGrantPermissions", true);
        URL url = new URL(zoiperElements.appiumAddress);
        driver = new AndroidDriver<>(url, dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}