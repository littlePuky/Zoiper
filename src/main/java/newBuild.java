import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.*;

public class newBuild extends twoDrivers {


    @Test()
    void rejectCall() {

        zoiperElements.dialPadButton(aDriver).click();
        zoiperElements.numberField(aDriver).sendKeys("11223344");
        zoiperElements.dialButton(aDriver).click();
        try {
            bDriver.findElement(MobileBy.AndroidUIAutomator
                    ("new UiSelector().description(\"Speaker\");")).isDisplayed();
            Dimension ScreenSize = bDriver.findElement(By.className("android.widget.RelativeLayout")).getSize();
            int x = ScreenSize.width / 2;
            int y = (int) (ScreenSize.height * 0.7);
            int declineCallX = (int) (ScreenSize.width * 0.1);
            int declineCallY = (int) (ScreenSize.height * 0.7);
            TouchAction touchAction = new TouchAction(bDriver);
            touchAction.longPress(PointOption.point(x, y)).moveTo(PointOption.point(declineCallX, declineCallY)).release().perform();
        } catch (Exception e) {
            bDriver.openNotifications();
            bDriver.findElement(MobileBy.AndroidUIAutomator
                    ("new UiSelector().description(\"Dismiss\");")).click();
        }
    }
}