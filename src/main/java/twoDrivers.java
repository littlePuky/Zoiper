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
        adc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        adc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        adc.setCapability("appActivity", "com.zoiper.android.app");
        adc.setCapability("udid", zoiperElements.deviceA);//name fo the device
        adc.setCapability("autoGrantPermissions", true);
        URL aurl = new URL(zoiperElements.appiumAddressA);
        aDriver = new AndroidDriver<>(aurl, adc);
        aDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //bDriver setup
        DesiredCapabilities bdc = new DesiredCapabilities();
        bdc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        bdc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        bdc.setCapability("appActivity", "com.zoiper.android.zoiperbeta.app");
        bdc.setCapability("udid", zoiperElements.deviceB);//name of the device
        bdc.setCapability("autoGrantPermissions", true);
        URL burl = new URL(zoiperElements.appiumAddressB);
        bDriver = new AndroidDriver<>(burl, bdc);
        bDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}