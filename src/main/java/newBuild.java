import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class newBuild {


//    @Test(priority = 2)
    void networkChanges() {
        System.out.println("asd");
        Assert.fail("Ignoring test " + Thread.currentThread().getStackTrace()[1].getMethodName() + " - user is subscribed.");
    }
    @Test(priority = 2)
    void Changes() {
        System.out.println("Ignoring Test \"" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\" - user is subscribed.");
        throw new SkipException("Ignoring Test ");
    }
}