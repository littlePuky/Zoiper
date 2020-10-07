import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class twoDrivers {

    AndroidDriver<AndroidElement> aDriver;
    AndroidDriver<AndroidElement> bDriver;


    @BeforeClass
    void starting2Drivers() throws MalformedURLException {

        //aDriver setup
        DesiredCapabilities adc = new DesiredCapabilities();
        adc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        adc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        adc.setCapability(MobileCapabilityType.DEVICE_NAME, "Huawei");
        adc.setCapability("appActivity", "com.zoiper.android.app");
        adc.setCapability("udid", "BUC7N17210014404");//name fo the device
        adc.setCapability("autoGrantPermissions", true);
        URL aurl = new URL("http://localhost:1000/wd/hub");
        aDriver = new AndroidDriver<>(aurl, adc);
        aDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //bDriver setup
        DesiredCapabilities bdc = new DesiredCapabilities();
        bdc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        bdc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        bdc.setCapability(MobileCapabilityType.DEVICE_NAME, "Huawei");
        bdc.setCapability("appActivity", "com.zoiper.android.app");
        bdc.setCapability("udid", "R58N64LDBXZ");//name of the device
        bdc.setCapability("autoGrantPermissions", true);
        URL burl = new URL("http://localhost:1001/wd/hub");
        bDriver = new AndroidDriver<>(burl, bdc);
        bDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        zoiperElements.dialPadButton(aDriver).click();
//        zoiperElements.numberField(aDriver).sendKeys("3030");
//        zoiperElements.dialButton(aDriver).click();
//        bDriver.openNotifications();
//        bDriver.findElement(MobileBy.AndroidUIAutomator
//                ("new UiSelector().text(\"Dismiss\");")).click();
    }
}