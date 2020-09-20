import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.*;


public class ZoiperSecondaryFeatures extends activeDriver {


    @Test(priority = 1)
    public void AccountRegister() throws InterruptedException {

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
//        zoiperElements.YESbutton(driver).click();
//        zoiperElements.doNotDisturbButton(driver).click();
//        zoiperElements.zoiperFreeDoNotDisturb(driver).click();
//        driver.switchTo().alert().accept();
//        Thread.sleep(2000);
//        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.cancelButton(driver).click();
    }

    @Test(priority = 1)
    void navDrawerFlipperDisplayed() {
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.flipper(driver).click();
        zoiperElements.premiumFeaturesMenu(driver).isDisplayed();
        driver.navigate().back();
    }

    @Test(priority = 2)
    void themes() {
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        settingsMenuElements.customizeSettings(driver).click();
        settingsMenuElements.pickATheme(driver).click();
        settingsMenuElements.themeTwo(driver).click();
        settingsMenuElements.applyTheme(driver).click();
        settingsMenuElements.currentTheme(driver).isDisplayed();
        settingsMenuElements.defaultTheme(driver).click();
        settingsMenuElements.applyTheme(driver).click();
        for (int i = 3; i <= 11; i++) {
            String themeNumber = "new UiSelector().description(\"" + i + "\");";
            driver.findElement(MobileBy.AndroidUIAutomator
                    (themeNumber)).click();
            settingsMenuElements.applyTheme(driver).click();
            settingsMenuElements.cancelButton(driver).click();
        }
        zoiperElements.navigateBack(driver).click();
        zoiperElements.navigateBack(driver).click();
        zoiperElements.navigateBack(driver).click();
    }

    @Test(priority = 3)
    void networkChanges() {

        String accCurrStatus;
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        settingsMenuElements.advancedSettings(driver).click();
        settingsMenuElements.supportedNetworks(driver).click();
        settingsMenuElements.Wifi(driver).click();
        zoiperElements.navigateBack(driver).click();
        zoiperElements.navigateBack(driver).click();
        settingsMenuElements.accountsSettings(driver).click();
        accCurrStatus = driver.findElement(By.id(settingsMenuElements.accStatusId)).getText();
        Assert.assertEquals(accCurrStatus, "Wrong network type");
        zoiperElements.navigateBack(driver).click();
        settingsMenuElements.advancedSettings(driver).click();
        settingsMenuElements.supportedNetworks(driver).click();
        settingsMenuElements.Wifi(driver).click();
        settingsMenuElements.twoG(driver).click();
        zoiperElements.navigateBack(driver).click();
        zoiperElements.navigateBack(driver).click();
        settingsMenuElements.accountsSettings(driver).click();
        accCurrStatus = driver.findElement(By.id(settingsMenuElements.accStatusId)).getText();
        Assert.assertTrue(accCurrStatus.equals("Account is ready") || accCurrStatus.equals("Account is ready   PUSH"));
        zoiperElements.navigateBack(driver).click();
        settingsMenuElements.advancedSettings(driver).click();
        settingsMenuElements.supportedNetworks(driver).click();
        settingsMenuElements.twoG(driver).click();
        settingsMenuElements.threeG(driver).click();
        zoiperElements.navigateBack(driver).click();
        zoiperElements.navigateBack(driver).click();
        settingsMenuElements.accountsSettings(driver).click();
        accCurrStatus = driver.findElement(By.id(settingsMenuElements.accStatusId)).getText();
        Assert.assertTrue(accCurrStatus.equals("Account is ready") || accCurrStatus.equals("Account is ready   PUSH"));
        zoiperElements.navigateBack(driver).click();
        settingsMenuElements.advancedSettings(driver).click();
        settingsMenuElements.supportedNetworks(driver).click();
        settingsMenuElements.threeG(driver).click();
        settingsMenuElements.fourG(driver).click();
        zoiperElements.navigateBack(driver).click();
        zoiperElements.navigateBack(driver).click();
        settingsMenuElements.accountsSettings(driver).click();
        accCurrStatus = driver.findElement(By.id(settingsMenuElements.accStatusId)).getText();
        Assert.assertTrue(accCurrStatus.equals("Account is ready") || accCurrStatus.equals("Account is ready   PUSH"));
        zoiperElements.navigateBack(driver).click();
        settingsMenuElements.advancedSettings(driver).click();
        settingsMenuElements.supportedNetworks(driver).click();
        settingsMenuElements.fourG(driver).click();
        zoiperElements.navigateBack(driver).click();
        zoiperElements.navigateBack(driver).click();
        zoiperElements.navigateBack(driver).click();
        //TODO add other network behaviour test VPN...
    }

    @Test(priority = 4)
    void subscribeMonthly() {

        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.premiumFeaturesNavigationDrawer(driver).click();
        zoiperElements.freeTrial(driver).click();
        zoiperElements.subMonthly(driver).click();
        zoiperElements.subscribeButton(driver).click();
        zoiperElements.confirmSubscription(driver).click();
        zoiperElements.passSubscription(driver).sendKeys(zoiperElements.subscriptionPass);
        zoiperElements.verifySubscription(driver).click();
//        driver.activateApp("com.android.vending");
//        phoneElements.playStoreNavDrawer(driver).click();
//        phoneElements.subscriptionsPlayStore(driver).click();
//        phoneElements.zoiperSubscriptionPlayStore(driver).click();
//        phoneElements.openAppPlayStore(driver).click();
//        phoneElements.cancelSubscriptionButton(driver).click();
//        phoneElements.declineToAnswer(driver).click();
//        phoneElements.continueButtonDeclineToAnswer(driver).click();
//        phoneElements.confirmCancelSubButton(driver).click();

    }

    @Test(priority = 5)
    void unlockedCallRecord() {

        driver.activateApp("com.zoiper.android.app");
        zoiperElements.dialPadButton(driver).click();
        zoiperElements.numberField(driver).sendKeys(zoiperElements.dialedDesktopNumber);
        zoiperElements.dialButton(driver).click();
        driver.switchTo().alert().accept();
        incallElements.threeDots(driver).click();
        incallElements.recordCall(driver).click();
        incallElements.indicatorRecordCall(driver).isDisplayed();
        incallElements.threeDots(driver).click();
        incallElements.stopRecording(driver).click();
        zoiperElements.endCallButton(driver).click();

    }

    @Test(priority = 6)
    void accessRecordings() {

        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.callRecordingNavigationDrawer(driver).click();
        String recordingName = driver.findElements
                (By.id("com.zoiper.android.app:id/recordingsListItemName")).get(0).getText();

        zoiperElements.recordingsCheckBox(driver).click();
        incallElements.threeDots(driver).click();
        zoiperElements.shareButton(driver).click();
        phoneElements.gmail(driver).click();
        String attachmentName = phoneElements.attachment(driver).getText();
        System.out.println(recordingName);
        System.out.println(attachmentName);
        Assert.assertEquals(attachmentName, recordingName);

    }

    @Test(priority = 7)
    void addContact() {
        driver.activateApp("com.zoiper.android.app");
        zoiperElements.contactsButton(driver).click();
//        zoiperElements.turnOnButton(driver).click();
//        driver.switchTo().alert().accept();
        zoiperElements.addContactsButton(driver).click();
        zoiperElements.editContactName(driver).click();
        phoneElements.firstName(driver).sendKeys("z");
        phoneElements.lastName(driver).sendKeys("1");
//        zoiperElements.createContactButton(driver).click();
//        zoiperElements.justOnceButton(driver).click();
//        zoiperElements.editContactName(driver).sendKeys(zoiperElements.dialedAndroidNumber);

        zoiperElements.editContactNumber(driver).sendKeys(zoiperElements.dialedAndroidNumber);
        zoiperElements.doneEditingContactNumber(driver).click();
        driver.closeApp();
//        driver.activateApp("com.zoiper.android.app");
//        zoiperElements.contactsButton(driver).click();
//        zoiperElements.fourTensNumber(driver).click();
//        driver.switchTo().alert().accept();
//        zoiperElements.endCallButton(driver).click();

    }

    @Test(priority = 8)
    void sortAndReformatContacts() throws InterruptedException {
        driver.activateApp("com.zoiper.android.app");
        zoiperElements.contactsButton(driver).click();
        String firstContactBefore = driver.findElements(By.id(zoiperElements.contactsListId)).
                get(0).findElements(By.className(zoiperElements.viewGroupClass)).
                get(0).findElements(By.className(zoiperElements.textViewClass)).get(1).getText();
        Assert.assertFalse(firstContactBefore.equals("1, z")||firstContactBefore.equals("1 z"));
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        settingsMenuElements.contactsSettings(driver).click();
        settingsMenuElements.sortOrder(driver).click();
        settingsMenuElements.lastName(driver).click();
        settingsMenuElements.nameFormat(driver).click();
        settingsMenuElements.firstLastName(driver).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(1000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        zoiperElements.contactsButton(driver).click();
        String firstContactRearranged = driver.findElements(By.id(zoiperElements.contactsListId)).
                get(0).findElements(By.className(zoiperElements.viewGroupClass)).
                get(0).findElements(By.className(zoiperElements.textViewClass)).get(1).getText();
        Assert.assertEquals(firstContactRearranged, "1, z");
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.settingsNavigationDrawer(driver).click();
        settingsMenuElements.contactsSettings(driver).click();
        settingsMenuElements.sortOrder(driver).click();
        settingsMenuElements.firstName(driver).click();
        settingsMenuElements.nameFormat(driver).click();
        settingsMenuElements.firstFirstName(driver).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(1000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        String firstContactAfter = driver.findElements(By.id(zoiperElements.contactsListId)).
                get(0).findElements(By.className(zoiperElements.viewGroupClass)).
                get(0).findElements(By.className(zoiperElements.textViewClass)).get(1).getText();
        Assert.assertFalse(firstContactAfter.equals("1, z")||firstContactAfter.equals("1 z"));
    }

    @Test(priority = 9)
    void favourite() throws InterruptedException {

//        Thread.sleep(1000);
        driver.pressKey(new KeyEvent(AndroidKey.CONTACTS));
        Thread.sleep(1000);
        phoneElements.searchContact(driver).sendKeys("z");
        phoneElements.z1Contact(driver).click();
        zoiperElements.favouriteStarButton(driver).click();

        driver.activateApp("com.zoiper.android.app");
        zoiperElements.favouritesButton(driver).click();
//        zoiperElements.turnOnButton(driver).click();
//        driver.switchTo().alert().accept();
        zoiperElements.favouriteContact(driver).isDisplayed();

    }

    @Test(priority = 10)
    void unFavourite() throws InterruptedException {

        driver.pressKey(new KeyEvent(AndroidKey.CONTACTS));
        phoneElements.searchContact(driver).sendKeys("z");
        phoneElements.z1Contact(driver).click();
        zoiperElements.unfavouriteButton(driver).click();
        Thread.sleep(1000);
        driver.activateApp("com.zoiper.android.app");
        zoiperElements.favouritesButton(driver).click();
        zoiperElements.addAFavouriteButton(driver).isDisplayed();
    }

    @Test(priority = 11)
    void followUs() {
        zoiperElements.navigationDrawer(driver).click();
        zoiperElements.followUsNavigationDrawer(driver).click();
        zoiperElements.facebookFollowUs(driver).click();
        phoneElements.facebookLink(driver).isDisplayed();
        driver.navigate().back();
        zoiperElements.twitterFollowUs(driver).click();
        phoneElements.twitterLink(driver).isDisplayed();
        driver.navigate().back();
        zoiperElements.navigateBack(driver).click();
    }

    @Test(priority = 12)
    void unsubscribe() throws InterruptedException {

        driver.activateApp("com.android.vending");
//        driver.pressKey(new KeyEvent(AndroidKey.BACK));
//        Thread.sleep(1000);
//        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        phoneElements.playStoreNavDrawer(driver).click();
        phoneElements.subscriptionsPlayStore(driver).click();
        phoneElements.zoiperSubscriptionPlayStore(driver).click();
        phoneElements.cancelSubscriptionButton(driver).click();
        phoneElements.declineToAnswer(driver).click();
        phoneElements.continueButtonDeclineToAnswer(driver).click();
        phoneElements.confirmCancelSubButton(driver).click();
    }

    @Test(priority = 13)
    void deleteContact() {
        driver.pressKey(new KeyEvent(AndroidKey.CONTACTS));
        phoneElements.searchContact(driver).sendKeys("z");
        phoneElements.z1Contact(driver).click();
        zoiperElements.moreOptionsButton(driver).click();
        zoiperElements.deleteContact(driver).click();
        zoiperElements.DELETEButton(driver).click();
    }
}


