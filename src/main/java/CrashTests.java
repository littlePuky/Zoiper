import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.*;


public class CrashTests extends DriverSetup {


    @Test(priority = 1)
    public void enterDiagnostics() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.agreeButton(driver).click();
        try {
            zoiperElements.skipButton(driver).click();
            zoiperElements.YESButton(driver).click();

        } catch (NoSuchElementException e) {
            System.out.println("The User is Subscribed! Some tests may be irrelevant!");
        }
        zoiperElements.userId(driver).sendKeys(zoiperElements.defaultAccNumber);
        zoiperElements.passField(driver).sendKeys(zoiperElements.accPass);
        zoiperElements.createAnAccButton(driver).click();
        zoiperElements.hostnameField(driver).sendKeys(zoiperElements.hostAddress);
        driver.hideKeyboard();
        zoiperElements.nextButton(driver).click();
        zoiperElements.skipButton(driver).click();
        zoiperElements.TCPSIP(driver).click();
        zoiperElements.finishButton(driver).click();
        try {
            zoiperElements.YESButton(driver).click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
//        zoiperElements.doNotDisturbButton(driver).click();
//        zoiperElements.zoiperFreeDoNotDisturb(driver).click();
//        driver.switchTo().alert().accept();
//        Thread.sleep(2000);
//        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.cancelButton(driver).click();

    }

    @Test(priority = 2)
    void simulateJavaCrash() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).sendKeys(zoiperElements.startDebug);
        zoiperElements.dialButton(driver).click();
        zoiperElements.OKButton(driver).click();
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.diagnosticNavDrawer(driver).click();
        zoiperElements.simulateCrash(driver).click();
        zoiperElements.javaCrash(driver).click();

    }

    @Test(priority = 3)
    void simulateNativeCrash() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.diagnosticNavDrawer(driver).click();
        zoiperElements.simulateCrash(driver).click();
        zoiperElements.nativeCrash(driver).click();

    }

    @Test(priority = 4)
    void simulateANRCrash() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.diagnosticNavDrawer(driver).click();
        zoiperElements.simulateCrash(driver).click();
        zoiperElements.simulateANR(driver).click();
    }
}