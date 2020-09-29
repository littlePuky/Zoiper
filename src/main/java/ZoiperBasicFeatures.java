import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class ZoiperBasicFeatures extends activeDriver {


    @Test(priority = 1)
    void AccountRegister() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.agreeButton(driver).click();
        try {
            String subButtonYearlyText = zoiperElements.subscribeButton(driver).getText();
            zoiperElements.subscribeButton(driver).click();
            zoiperElements.confirmSubscription(driver).isDisplayed();
            Thread.sleep(1000);
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
            zoiperElements.subMonthly(driver).click();
            String subButtonMonthlyText = zoiperElements.subscribeButton(driver).getText();
            zoiperElements.subscribeButton(driver).click();
            zoiperElements.confirmSubscription(driver).isDisplayed();
            Thread.sleep(1000);
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
            zoiperElements.skipButton(driver).click();
            zoiperElements.NObutton(driver).click();
            zoiperElements.skipButton(driver).click();
            zoiperElements.YESButton(driver).click();
            Assert.assertEquals(subButtonMonthlyText, "CONTINUE");
            Assert.assertEquals(subButtonYearlyText, "7 DAY FREE TRIAL");
        } catch (NoSuchElementException e) {
            System.out.println("The User is Subscribed! Some tests will be ignored!");
            zoiperElements.isSubscribed = true;
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        zoiperElements.userIdField(driver).sendKeys(zoiperElements.defaultAccNumber);
        zoiperElements.passField(driver).sendKeys(zoiperElements.accPass);
        zoiperElements.createAnAccButton(driver).click();
        zoiperElements.hostnameField(driver).sendKeys(zoiperElements.hostAddress);
        try {
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            driver.hideKeyboard();
        } catch (Exception e) {
            System.out.println("No keyboard is present.");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        zoiperElements.nextButton(driver).click();
        zoiperElements.skipButton(driver).click();
        zoiperElements.TCPSIP(driver).click();
        zoiperElements.finishButton(driver).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
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

    }

    @Test(priority = 1)
    void makeCall() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.favouritesButton(driver).click();
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).sendKeys(zoiperElements.dialedAndroidNumber);
        zoiperElements.dialButton(driver).click();
        incallElements.threeDots(driver).click();
        incallElements.callStat(driver).click();
        String jitter = incallElements.interarrivalJitter(driver).getText();
        String packet = incallElements.currentPacketLoss(driver).getText();
        System.out.println("Interarrival jitter: " + jitter);
        System.out.println("Current packet loss: " + packet);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.endCallButton(driver).click();
        Assert.assertTrue((jitter.equals("0 ms") || jitter.equals("1 ms") || jitter.equals("2 ms") || jitter.equals("3 ms")
                || jitter.equals("4 ms") || jitter.equals("5 ms") || jitter.equals("6 ms") || jitter.equals("7 ms")
                || jitter.equals("8 ms") || jitter.equals("9 ms") || jitter.equals("10 ms") || jitter.equals("11 ms")
                || jitter.equals("12 ms") || jitter.equals("13 ms") || jitter.equals("14 ms") || jitter.equals("15 ms")
                || jitter.equals("16 ms") || jitter.equals("17 ms") || jitter.equals("18 ms") || jitter.equals("19 ms")
                &&
                ((packet.equals("0 ‰")) || (packet.equals("1 ‰")) || (packet.equals("2 ‰")) || (packet.equals("3 ‰"))
                        || (packet.equals("4 ‰")) || (packet.equals("5 ‰")) || (packet.equals("6 ‰")) || (packet.equals("7 ‰"))
                        || (packet.equals("8 ‰")) || (packet.equals("9 ‰")) || (packet.equals("10 ‰")) || (packet.equals("11 ‰"))
                        || (packet.equals("12 ‰")) || (packet.equals("13 ‰")) || (packet.equals("14 ‰")) || (packet.equals("15 ‰"))
                        || (packet.equals("16 ‰")) || (packet.equals("17 ‰")) || (packet.equals("18 ‰")) || (packet.equals("19 ‰"))
                        || (packet.equals("20 ‰")) || (packet.equals("21 ‰")) || (packet.equals("22 ‰")) || (packet.equals("23 ‰"))
                        || (packet.equals("24 ‰")) || (packet.equals("25 ‰")) || (packet.equals("26 ‰")) || (packet.equals("27 ‰"))
                        || (packet.equals("28 ‰")) || (packet.equals("29 ‰")) || (packet.equals("30 ‰")) || (packet.equals("31 ‰"))
                        || (packet.equals("32 ‰")) || (packet.equals("33 ‰")) || (packet.equals("34 ‰")) || (packet.equals("35 ‰"))
                        || (packet.equals("36 ‰")) || (packet.equals("37 ‰")) || (packet.equals("38 ‰")) || (packet.equals("39 ‰"))
                        || (packet.equals("40 ‰")) || (packet.equals("41 ‰")) || (packet.equals("42 ‰")) || (packet.equals("43 ‰"))
                        || (packet.equals("44 ‰")) || (packet.equals("45 ‰")) || (packet.equals("46 ‰")) || (packet.equals("47 ‰"))
                        || (packet.equals("48 ‰")) || (packet.equals("49 ‰")))));
    }

    @Test(priority = 2)
    void lockedAccessAccountSettingsTroughNavDrawer() throws InterruptedException {
        if (zoiperElements.isSubscribed) {
            System.out.println("Ignoring test \"" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\" - user is subscribed.");
            throw new SkipException("Ignoring test ");
        }
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.accountArrowNavigationDrawer(driver).click();
        zoiperElements.addAccountNavDrawerButton(driver).click();
        zoiperSettingsElements.upgradePopup(driver).isDisplayed();
        settingsMenuElements.cancelButton(driver).click();
        Thread.sleep(1000);
        driver.navigate().back();
    }

    @Test(priority = 3)
    void pushLock() {
        if (zoiperElements.isSubscribed) {
            System.out.println("Ignoring test \"" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\" - user is subscribed.");
            throw new SkipException("Ignoring test ");
        }
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.connectivity(driver).click();
        zoiperSettingsElements.lockIcon(driver).click();
        zoiperSettingsElements.upgradePopup(driver).isDisplayed();
        settingsMenuElements.cancelButton(driver).click();
        for (int backClicks = 2; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
    }

    @Test(priority = 4)
    void customizeLock() {
        if (zoiperElements.isSubscribed) {
            System.out.println("Ignoring test \"" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\" - user is subscribed.");
            throw new SkipException("Ignoring test ");
        }
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.customize(driver).click();
        zoiperSettingsElements.lockIcon(driver).click();
        zoiperSettingsElements.upgradePopup(driver).isDisplayed();
        settingsMenuElements.cancelButton(driver).click();
        for (int backClicks = 2; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
    }

    @Test(priority = 5)
    void callsSettingsLocksCount() {
        if (zoiperElements.isSubscribed) {
            System.out.println("Ignoring test \"" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\" - user is subscribed.");
            throw new SkipException("Ignoring test ");
        }
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.calls(driver).click();
        int locks = driver.findElements(By.id(zoiperElements.premiumLockId)).size();
        for (int backClicks = 2; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
        Assert.assertEquals(locks, 3);
    }

    @Test(priority = 6)
    void audioCodecsAndPresenceLocksCount() {
        if (zoiperElements.isSubscribed) {
            System.out.println("Ignoring test \"" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\" - user is subscribed.");
            throw new SkipException("Ignoring test ");
        }
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.accounts(driver).click();
        accountsSettings.defaultAccountSelect(driver).click();
        Actions builder = new Actions(driver);
        builder.clickAndHold(accountsSettings.hostSettings(driver))
                .moveToElement(accountsSettings.SIPaccSettings(driver))
                .release()
                .perform();
        accountsSettings.enableSubscribePresence(driver).click();
        settingsMenuElements.cancelButton(driver).click();
        accountsSettings.enablePublishPresence(driver).click();
        settingsMenuElements.cancelButton(driver).click();
        accountsSettings.audioCodecSettings(driver).click();
        int audioLocks = driver.findElements(By.id(zoiperElements.codecLockId)).size();
        accountsSettings.opusSuper(driver).isDisplayed();
        int audioLocks2 = driver.findElements(By.id(zoiperElements.codecLockId)).size();
        for (int backClicks = 4; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
        //What really matters is the size of the screen not the android version
        int totalAudioCodecLocks;

        if (zoiperElements.androidVersion.equals("7.0")) {

            totalAudioCodecLocks = audioLocks + audioLocks2 - 2;
            Assert.assertEquals(totalAudioCodecLocks, 9);
        } else if (zoiperElements.androidVersion.equals("10")) {

            totalAudioCodecLocks = audioLocks + audioLocks2 - 2;
            Assert.assertEquals(totalAudioCodecLocks, 12);
        }
    }

    @Test(priority = 7)
    void videoCodecsLocksCount() {
        if (zoiperElements.isSubscribed) {
            System.out.println("Ignoring test \"" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\" - user is subscribed.");
            throw new SkipException("Ignoring test ");
        }
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.accounts(driver).click();
        accountsSettings.defaultAccountSelect(driver).click();
        accountsSettings.videoCodecSettings(driver).click();
        zoiperSettingsElements.codecLockIcon(driver).click();
        zoiperSettingsElements.upgradePopup(driver).isDisplayed();
        settingsMenuElements.cancelButton(driver).click();
        for (int backClicks = 4; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
    }

    @Test(priority = 8)
    void encryptionLock() {
        if (zoiperElements.isSubscribed) {
            System.out.println("Ignoring test \"" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\" - user is subscribed.");
            throw new SkipException("Ignoring test ");
        }
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.accounts(driver).click();
        accountsSettings.defaultAccountSelect(driver).click();
        accountsSettings.encryption(driver).click();
        zoiperSettingsElements.lockIcon(driver).click();
        zoiperSettingsElements.upgradePopup(driver).isDisplayed();
        settingsMenuElements.cancelButton(driver).click();
        for (int backClicks = 4; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
    }

    @Test(priority = 9)
    void callRecordingsLock() {
        if (zoiperElements.isSubscribed) {
            System.out.println("Ignoring test \"" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\" - user is subscribed.");
            throw new SkipException("Ignoring test ");
        }
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.callRecordingNavigationDrawer(driver).click();
        zoiperSettingsElements.upgradePopup(driver).isDisplayed();
        settingsMenuElements.cancelButton(driver).click();
        zoiperElements.linearCallRecordings(driver).isDisplayed();
        zoiperElements.navigateBack(driver).click();
    }

    @Test(priority = 10)
    void inCallLocksCount() {
        if (zoiperElements.isSubscribed) {
            System.out.println("Ignoring test \"" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\" - user is subscribed.");
            throw new SkipException("Ignoring test ");
        }
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).sendKeys(zoiperElements.dialedDesktopNumber);
        zoiperElements.dialButton(driver).click();
        incallElements.threeDots(driver).click();
        int callLocks = driver.findElements(By.id(zoiperElements.inCallLockId)).size();
        incallElements.addCall(driver).click();
        zoiperSettingsElements.upgradePopup(driver).isDisplayed();
        settingsMenuElements.cancelButton(driver).click();
        zoiperElements.endCallButton(driver).click();
        Assert.assertEquals(callLocks, 3);
    }

    @Test(priority = 11)
    void subscribe() {
        if (zoiperElements.isSubscribed) {
            System.out.println("Ignoring test \"" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\" - user is subscribed.");
            throw new SkipException("Ignoring test ");
        }
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.premiumFeaturesNavigationDrawer(driver).click();
        zoiperElements.freeTrial(driver).click();
        String subButtonYearlyText = zoiperElements.subscribeButton(driver).getText();
        zoiperElements.subMonthly(driver).click();
        String subButtonMonthlyText = zoiperElements.subscribeButton(driver).getText();
        zoiperElements.subscribeButton(driver).click();
        try {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            zoiperElements.confirmSubscription(driver).click();
            zoiperElements.passSubscription(driver).sendKeys(zoiperElements.subscriptionPass);
            zoiperElements.verifySubscription(driver).click();
        } catch (NoSuchElementException e) {
            System.out.println("No pass required!");
        }
        try {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            phoneElements.paymentAuthenticationRequestNo(driver).click();
            zoiperElements.OKButton(driver).click();
        } catch (NoSuchElementException e) {
            System.out.println("No authentication required.");
        }
        zoiperElements.navigateBack(driver).click();
        Assert.assertEquals(subButtonMonthlyText, "CONTINUE");
        Assert.assertEquals(subButtonYearlyText, "7 DAY FREE TRIAL");
    }

    @Test(priority = 12)
    void locksAfterSubscription() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test(priority = 13)
    void retestPushLock() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.connectivity(driver).click();
        int push = driver.findElements(By.id(zoiperElements.premiumLockId)).size();
        for (int backClicks = 2; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
        Assert.assertEquals(push, 0);
    }

    @Test(priority = 14)
    void retestCustomizeLock() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.customize(driver).click();
        int customize = driver.findElements(By.id(zoiperElements.premiumLockId)).size();
        for (int backClicks = 2; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
        Assert.assertEquals(customize, 0);
    }

    @Test(priority = 15)
    void retestCallsLocksCount() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.calls(driver).click();
        int locks = driver.findElements(By.id(zoiperElements.premiumLockId)).size();
        for (int backClicks = 2; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
        Assert.assertEquals(locks, 0);
    }

    @Test(priority = 16)
    void retestAudioCodecsAndPresenceLocksCount() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.accounts(driver).click();
        accountsSettings.defaultAccountSelect(driver).click();
        Actions builder = new Actions(driver);
        builder.clickAndHold(accountsSettings.hostSettings(driver))
                .moveToElement(accountsSettings.SIPaccSettings(driver))
                .release()
                .perform();
        int presenceLock = driver.findElements(By.id(zoiperElements.premiumLockId)).size();
        accountsSettings.enableSubscribePresence(driver).click();
        accountsSettings.enablePublishPresence(driver).click();
        accountsSettings.audioCodecSettings(driver).click();
        int audioLocks1 = driver.findElements(By.id(zoiperElements.codecLockId)).size();
        accountsSettings.opusSuper(driver).isDisplayed();
        int audioLocks2 = driver.findElements(By.id(zoiperElements.codecLockId)).size();
        for (int backClicks = 4; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
        Assert.assertEquals(presenceLock, 0);
        //What really matters is the size of the screen not the android version
        int totalAudioCodecLocks;

        if (zoiperElements.androidVersion.equals("7.0")) {

            totalAudioCodecLocks = audioLocks1 + audioLocks2;
            Assert.assertEquals(totalAudioCodecLocks, 0);
        } else if (zoiperElements.androidVersion.equals("10")) {

            totalAudioCodecLocks = audioLocks1 + audioLocks2;
            Assert.assertEquals(totalAudioCodecLocks, 0);
        }
        //TODO verify presence is working
    }

    @Test(priority = 17)
    void retestVideoCodecsLocksCount() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.accounts(driver).click();
        accountsSettings.defaultAccountSelect(driver).click();
        accountsSettings.videoCodecSettings(driver).click();
        int video = driver.findElements(By.id(zoiperElements.codecLockId)).size();
        for (int backClicks = 4; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
        Assert.assertEquals(video, 0);

    }

    @Test(priority = 18)
    void retestEncryptionLock() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.accounts(driver).click();
        accountsSettings.defaultAccountSelect(driver).click();
        accountsSettings.encryption(driver).click();
        int encryption = driver.findElements(By.id(zoiperElements.premiumLockId)).size();
        Assert.assertEquals(encryption, 0);
        for (int backClicks = 4; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
    }

    @Test(priority = 19)
    void inCallLocksReCount() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//bad connection
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).sendKeys(zoiperElements.dialedDesktopNumber);
        zoiperElements.dialButton(driver).click();
        incallElements.threeDots(driver).click();
        int callLocks = driver.findElements(By.id(zoiperElements.inCallLockId)).size();
        driver.navigate().back();
        zoiperElements.endCallButton(driver).click();
        Assert.assertEquals(callLocks, 0);
    }

    @Test(priority = 20)
    void unlockedVideoCall() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).sendKeys(zoiperElements.dialedDesktopNumber);
        zoiperElements.dialButton(driver).click();
        incallElements.threeDots(driver).click();
        incallElements.videoCall(driver).click();
        incallElements.videoCallDisplay(driver).isDisplayed();
        incallElements.endVideoCall(driver).click();
        zoiperElements.endCallButton(driver).click();
    }

    @Test(priority = 21)
    void unlockedAddAndMergeCalls() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).sendKeys(zoiperElements.dialedDesktopNumber);
        zoiperElements.dialButton(driver).click();
        incallElements.threeDots(driver).click();
        incallElements.addCall(driver).click();
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).sendKeys(zoiperElements.dialedAndroidNumber);
        zoiperElements.dialButton(driver).click();
        Thread.sleep(2000);
        incallElements.onHold(driver).isDisplayed();
        incallElements.threeDots(driver).click();
        incallElements.mergeCalls(driver).click();
        incallElements.manageConferenceCall(driver).click();
        zoiperElements.mergedAndroidNumber(driver).isDisplayed();
        try {
            zoiperElements.mergedDesktopNumber(driver).isDisplayed();
        } catch (NoSuchElementException e) {
            driver.findElement(MobileBy.AndroidUIAutomator
                    ("new UiSelector().text(\"" + zoiperElements.dialedDesktopNumber + "\");")).isDisplayed();
        }
        driver.navigate().back();
        zoiperElements.endCallButton(driver).click();
    }

    @Test(priority = 22)
    void unlockedCallRecord() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.favouritesButton(driver).click();
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).sendKeys(zoiperElements.dialedDesktopNumber);
        zoiperElements.dialButton(driver).click();
        incallElements.threeDots(driver).click();
        incallElements.recordCall(driver).click();
        incallElements.indicatorRecordCall(driver).isDisplayed();
        incallElements.threeDots(driver).click();
        incallElements.stopRecording(driver).click();
        zoiperElements.endCallButton(driver).click();
    }

    @Test(priority = 23)
    void transferCall() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).sendKeys(zoiperElements.dialedDesktopNumber);
        zoiperElements.dialButton(driver).click();
        incallElements.threeDots(driver).click();
        incallElements.transferCall(driver).click();
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).sendKeys(zoiperElements.dialedAndroidNumber);
        zoiperElements.dialButton(driver).click();
        Thread.sleep(1000);
        zoiperElements.favouritesButton(driver).isDisplayed();
    }

    @Test(priority = 24)
    void addContact() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        zoiperElements.contactsButton(driver).click();
        zoiperElements.addContactsButton(driver).click();
        try {
            phoneElements.saveContactToPhoneRadioButton(driver).click();
            phoneElements.justOnceButton(driver).click();
            phoneElements.addNewContactNumber(driver).click();
            driver.getKeyboard().sendKeys(zoiperElements.dialedAndroidNumber);
            phoneElements.saveNewNumber(driver).click();
            System.out.println("Android 10 Contacts");
        } catch (NoSuchElementException e) {
            zoiperElements.editContactName(driver).sendKeys(zoiperElements.dialedAndroidNumber);
            zoiperElements.editContactNumber(driver).sendKeys(zoiperElements.dialedAndroidNumber);
            zoiperElements.doneEditingContactNumber(driver).click();
            System.out.println("Android 7 Contacts");
        }
        driver.activateApp("com.zoiper.android.app");
        zoiperElements.contactsButton(driver).click();
        zoiperElements.searchFieldClick(driver).click();
        zoiperElements.searchFieldInsert(driver).sendKeys(zoiperElements.dialedAndroidNumber);
        phoneElements.createdContactSearch(driver).click();
        try {
            zoiperElements.endCallButton(driver).click();
        } catch (NoSuchElementException e) {
            System.out.println("Number couldn't be dialed! Check connection.");
        }
        zoiperElements.backFromSearch(driver).click();
    }

    @Test(priority = 25)
    void sendMessage() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.activateApp("com.zoiper.android.app");
        zoiperElements.messagesMenuButton(driver).click();
        zoiperElements.startMessageButton(driver).click();
        zoiperElements.messageRecipientField(driver).sendKeys(zoiperElements.dialedAndroidNumber);
        zoiperElements.typeMessageField(driver).sendKeys(zoiperElements.autoMessage + " " + ++zoiperElements.messageCounter);
        zoiperElements.sendArrowButton(driver).click();
        zoiperElements.backZoiperButton(driver).click();
    }

    @Test(priority = 26, dependsOnMethods = {"makeCall"})
    void accessHistory() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.historyButton(driver).click();
//        zoiperElements.presenceIcon(driver).isDisplayed();
        //TODO verify Presence is displaying the proper status (ADD own number to contacts to see status text)
        zoiperElements.fullHistoryButton(driver).click();
        zoiperElements.lastMadeCall(driver).isDisplayed();
        zoiperElements.navigateBack(driver).click();
    }

    @Test(priority = 27, dependsOnMethods = {"makeCall"})
    void clickAndHoldToCopyNumberFromContact() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        zoiperElements.historyButton(driver).click();
        Actions builder = new Actions(driver);
        builder.clickAndHold(zoiperElements.addedContactNumber(driver)).perform();
        zoiperElements.copyNumberButton(driver).click();
        zoiperElements.favouritesButton(driver).click();
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).click();
        driver.pressKey(new KeyEvent(AndroidKey.PASTE));
        zoiperElements.addedContactNumber(driver).isDisplayed();
        zoiperElements.dialButton(driver).click();
        zoiperElements.endCallButton(driver).click();
    }

    @Test(priority = 28, dependsOnMethods = {"makeCall"})
    void clickAndHoldEditNumberBeforeCall() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        zoiperElements.historyButton(driver).click();
        Actions builder = new Actions(driver);
        builder.clickAndHold(zoiperElements.addedContactNumber(driver)).perform();
        zoiperElements.editNumberBeforeCallButton(driver).click();
        zoiperElements.addedContactNumber(driver).isDisplayed();
        zoiperElements.dialButton(driver).click();
        zoiperElements.endCallButton(driver).click();
    }

    @Test(priority = 29)
    void pushCall() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        zoiperSettingsElements.calls(driver).click();
        zoiperSettingsElements.autoAnswer(driver).click();
        zoiperSettingsElements.instantAnswer(driver).click();
        zoiperSettingsElements.keepSettingsAfterRestart(driver).click();
        for (int backClicks = 2; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
        zoiperElements.navigationDrawer(driver).click();
        zoiperSettingsElements.exitButton(driver).click();
        zoiperElements.YesButton(driver).click();
        driver.activateApp("com.zoiper.android.zoiperbeta.app");
        try {
            zoiperElements.OKButton(driver).click();
        } catch (NoSuchElementException e) {
            System.out.println("OK is not displayed");
        }
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).sendKeys(zoiperElements.defaultAccNumber);
        zoiperElements.dialButton(driver).click();
        zoiperElements.OKButton(driver).click();
        incallElements.threeDots(driver).isDisplayed();
        zoiperElements.endCallButton(driver).click();
        driver.activateApp("com.zoiper.android.app");
    }

    @Test(priority = 30)
    void addAccNavDrawer() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.accountArrowNavigationDrawer(driver).click();
        zoiperElements.addAccountNavDrawerButton(driver).click();
        zoiperElements.userIdField(driver).sendKeys(zoiperElements.secondAccNumber);
        zoiperElements.passField(driver).sendKeys(zoiperElements.accPass);
        zoiperElements.createAnAccButton(driver).click();
        zoiperElements.hostnameField(driver).sendKeys(zoiperElements.hostAddress);
        driver.hideKeyboard();
        zoiperElements.nextButton(driver).click();
        zoiperElements.skipButton(driver).click();
        zoiperElements.TCPSIP(driver).click();
        zoiperElements.finishButton(driver).click();
        Thread.sleep(1000);
        driver.navigate().back();

    }

    @Test(priority = 31)
    void addAccFromSettings() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        settingsMenuElements.accountsSettings(driver).click();
        zoiperElements.createAccButton(driver).click();
        zoiperElements.userIdField(driver).sendKeys(zoiperElements.thirdAccNumber);
        zoiperElements.passField(driver).sendKeys(zoiperElements.accPass);
        zoiperElements.createAnAccButton(driver).click();
        zoiperElements.hostnameField(driver).sendKeys(zoiperElements.hostAddress);
        driver.hideKeyboard();
        zoiperElements.nextButton(driver).click();
        zoiperElements.skipButton(driver).click();
        zoiperElements.TCPSIP(driver).click();
        zoiperElements.finishButton(driver).click();
        Thread.sleep(1000);
        zoiperElements.thirdAcc(driver).isDisplayed();
        for (int backClicks = 2; backClicks >= 1; backClicks--) {
            zoiperElements.navigateBack(driver).click();
        }
    }

    @Test(priority = 32, dependsOnMethods = {"addAccNavDrawer"})
    void switchAccounts() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Thread.sleep(1000);
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.accountArrowNavigationDrawer(driver).click();
        zoiperElements.secondAcc(driver).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.secondAcc(driver).isDisplayed();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    @Test(priority = 33, dependsOnMethods = {"addAccNavDrawer"})
    void deleteAcc() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        settingsMenuElements.accountsSettings(driver).click();
        int accountsCount1 = driver.findElements(By.id(zoiperElements.accListId)).size();
        Actions builder = new Actions(driver);
        builder.clickAndHold(zoiperElements.secondAcc(driver)).perform();
        zoiperElements.OKButton(driver).click();
        int accountsCount2 = driver.findElements(By.id(zoiperElements.accListId)).size();
        Assert.assertEquals(accountsCount2, accountsCount1 - 1);
    }

    @Test(priority = 34, dependsOnMethods = {"addContact"})
    void deleteContact() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.pressKey(new KeyEvent(AndroidKey.CONTACTS));
        try {
            phoneElements.android7SearchPhoneContact(driver).sendKeys(zoiperElements.dialedAndroidNumber);
            zoiperElements.addedContactNumber(driver).click();
            zoiperElements.moreOptionsButton(driver).click();
            zoiperElements.deleteContact(driver).click();
            zoiperElements.DELETEButton(driver).click();
        } catch (NoSuchElementException e) {
            phoneElements.android10SearchPhoneContact(driver).click();
            driver.getKeyboard().sendKeys(zoiperElements.dialedAndroidNumber);
            phoneElements.createdContactSearch(driver).click();
            phoneElements.moreOptions(driver).click();
            zoiperElements.deleteButton(driver).click();
            phoneElements.moveToTrashButton(driver).click();
        }
        driver.activateApp("com.zoiper.android.app");
    }

    @Test(priority = 35, dependsOnMethods = {"unlockedCallRecord"})
    void deleteRecordings() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.activateApp("com.zoiper.android.app");
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.callRecordingNavigationDrawer(driver).click();
        incallElements.threeDots(driver).click();
        zoiperElements.selectAllButton(driver).click();
        incallElements.threeDots(driver).click();
        zoiperElements.deleteButton(driver).click();
        zoiperElements.OKButton(driver).click();
        zoiperElements.noCallRecords(driver).isDisplayed();
        zoiperElements.navigateBack(driver).click();
    }

    @Test(priority = 36, dependsOnMethods = {"sendMessage"})
    void deleteMessageThreadHistory() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.messagesMenuButton(driver).click();
        Actions builder = new Actions(driver);
        builder.clickAndHold(zoiperElements.messageThread(driver)).perform();
        zoiperElements.deleteThread(driver).click();
        zoiperElements.OKButton(driver).click();
        zoiperElements.noConversations(driver).isDisplayed();
    }

    @Test(priority = 37)
    void unsubscribe() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        try {
            driver.activateApp("com.android.vending");
            phoneElements.playStoreNavDrawer(driver).click();
            phoneElements.subscriptionsPlayStore(driver).click();
            phoneElements.zoiperSubscriptionPlayStore(driver).click();
            phoneElements.cancelSubscriptionButton(driver).click();
            phoneElements.declineToAnswer(driver).click();
            phoneElements.continueButtonDeclineToAnswer(driver).click();
            phoneElements.confirmCancelSubButton(driver).click();
        } catch (NoSuchElementException e) {
            System.out.println("Subscription is auto-canceled by Google Play!");
        }
    }
}