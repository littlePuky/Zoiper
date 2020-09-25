import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.*;


public class ListeningPorts extends DriverSetup {

    @Test(priority = 1)
    public void AccountRegister() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.agreeButton(driver).click();
        try {
            zoiperElements.skipButton(driver).click();
            zoiperElements.YESButton(driver).click();

        } catch (NoSuchElementException e) {
            System.out.println("The User is Subscribed! Some tests may be irrelevant!");
        }
        zoiperElements.userIdField(driver).sendKeys(zoiperElements.defaultAccNumber);
        zoiperElements.passField(driver).sendKeys(zoiperElements.accPass);
        zoiperElements.createAnAccButton(driver).click();
        zoiperElements.hostnameField(driver).sendKeys(zoiperElements.hostAddress);
        driver.hideKeyboard();
        zoiperElements.nextButton(driver).click();
        zoiperElements.skipButton(driver).click();
//        zoiperElements.UDPSIP(driver).click();
        zoiperElements.TCPSIP(driver).click();
        zoiperElements.finishButton(driver).click();
        try {
            zoiperElements.YESAtStartupButton(driver).click();
        } catch (NoSuchElementException e) {
            System.out.println("YES button is not present.");
        }
//        zoiperElements.doNotDisturbButton(driver).click();
//        zoiperElements.zoiperFreeDoNotDisturb(driver).click();
//        driver.switchTo().alert().accept();
//        Thread.sleep(2000);
//        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.cancelButton(driver).click();
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
//        settingsMenuElements.connectivitySettings(driver).click();
    }


    @Test(priority = 1)
    void localSIPPortOff() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        settingsMenuElements.connectivitySettings(driver).click();
        settingsMenuElements.listeningPorts(driver).click();
        driver.findElements(By.id(zoiperElements.checkboxId)).get(0).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.restartingZoiperMessage(driver).isDisplayed();

    }

    @Test(priority = 1)
    void localIAXPortOff() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        settingsMenuElements.connectivitySettings(driver).click();
        settingsMenuElements.listeningPorts(driver).click();
        driver.findElements(By.id(zoiperElements.checkboxId)).get(1).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.restartingZoiperMessage(driver).isDisplayed();

    }

    @Test(priority = 1)
    void localRTPPortOff() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        settingsMenuElements.connectivitySettings(driver).click();
        settingsMenuElements.listeningPorts(driver).click();
        driver.findElements(By.id(zoiperElements.checkboxId)).get(2).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.restartingZoiperMessage(driver).isDisplayed();

    }

    @Test(priority = 1)
    void localTLSPortOff() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        settingsMenuElements.connectivitySettings(driver).click();
        settingsMenuElements.listeningPorts(driver).click();
        driver.findElements(By.id(zoiperElements.checkboxId)).get(3).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.restartingZoiperMessage(driver).isDisplayed();

    }

    @Test(priority = 2)
    void localSIPPortOn() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        settingsMenuElements.connectivitySettings(driver).click();
        settingsMenuElements.listeningPorts(driver).click();
        driver.findElements(By.id(zoiperElements.checkboxId)).get(0).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.restartingZoiperMessage(driver).isDisplayed();

    }

    @Test(priority = 2)
    void localIAXPortOn() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        settingsMenuElements.connectivitySettings(driver).click();
        settingsMenuElements.listeningPorts(driver).click();
        driver.findElements(By.id(zoiperElements.checkboxId)).get(1).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.restartingZoiperMessage(driver).isDisplayed();

    }

    @Test(priority = 2)
    void localRTPPortOn() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        settingsMenuElements.connectivitySettings(driver).click();
        settingsMenuElements.listeningPorts(driver).click();
        driver.findElements(By.id(zoiperElements.checkboxId)).get(2).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.restartingZoiperMessage(driver).isDisplayed();

    }

    @Test(priority = 2)
    void localTLSPortOn() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        settingsMenuElements.connectivitySettings(driver).click();
        settingsMenuElements.listeningPorts(driver).click();
        driver.findElements(By.id(zoiperElements.checkboxId)).get(3).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.restartingZoiperMessage(driver).isDisplayed();

    }
}