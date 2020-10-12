import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class zoiperElements {
    private static WebElement element;
    private static MobileElement mobileElement;
    public static String apkPath = "C:\\Users\\zedd\\Desktop\\zoiper_2.16.4_434_release.apk";
    public static String hostAddress = "sip4.zoiper.com";//"10.2.1.99:6060"
    public static String appiumDefaultAddress = "http://localhost:4723/wd/hub";
    public static String defaultAccNumber = "3030";
    public static String secondAccNumber = "2000";
    public static String thirdAccNumber = "3000";
    public static String dialedAndroidNumber = "10101010";
    public static String dialedDesktopNumber = "4040";
    public static String accPass = "parola";
    public static String subscriptionPass = "Zoais100%niceguy";
    public static String autoMessage = "Auto Message";
    public static String premiumLockId = "com.zoiper.android.app:id/premium_lock";
    public static String codecLockId = "com.zoiper.android.app:id/codec_lock";
    public static String checkboxId = "android:id/checkbox";
    public static String inCallLockId = "com.zoiper.android.app:id/custom_menu_item_lock";
    public static String startDebug = "7827833284";
    public static String androidVersion = "7.0";
    public static String contactsListId = "android:id/list";
    public static String viewGroupClass = "android.view.ViewGroup";
    public static String textViewClass = "android.widget.TextView";
    public static String accListId = "com.zoiper.android.app:id/account_list_row_id";
    public static String flipperId = "com.zoiper.android.app:id/viewFlipper";
    public static String googlePlayAcc = "qa7.zoiper@gmail.com";
    public static String deviceA = "BUC7N17210014404";
    public static String deviceB = "W6HDU16330004020";
    public static String appiumAddressA = "http://localhost:1000/wd/hub";
    public static String appiumAddressB = "http://localhost:1001/wd/hub";
    public static int messageCounter;
    public static boolean isSubscribed = false;

    public static WebElement zoiperVersion(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"ZoiPer 2.16.4\");"));
        return mobileElement;
    }

    public static MobileElement agreeButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Agree & Continue\");"));
        return mobileElement;
    }

    public static MobileElement userIdField(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Username @ PBX/VoIP provider\");"));
        return mobileElement;
    }

    public static MobileElement passField(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Password\");"));
        return mobileElement;
    }

    public static WebElement YESAtStartupButton(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("android:id/button1"));
        return element;
    }

    public static MobileElement YESButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"YES\"));"));
        return mobileElement;
    }

    public static MobileElement NObutton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"NO\"));"));
        return mobileElement;
    }

    public static MobileElement createAnAccButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Create an account\");"));
        return mobileElement;
    }

    public static MobileElement providersButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Providers list\");"));
        return mobileElement;
    }

    public static MobileElement hostnameField(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"hostname or provider\");"));
        return mobileElement;
    }

    public static MobileElement nextButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Next\");"));
        return mobileElement;
    }

    public static MobileElement skipButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Skip\");"));
        return mobileElement;
    }

    public static MobileElement TLSSIP(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"SIP TLS\");"));
        return mobileElement;
    }

    public static MobileElement TCPSIP(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"SIP TCP\");"));
        return mobileElement;
    }

    public static MobileElement UDPSIP(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"SIP UDP\");"));
        return mobileElement;
    }

    public static MobileElement IAXUDP(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"IAX UDP\");"));
        return mobileElement;
    }

    public static MobileElement finishButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Finish\");"));
        return mobileElement;
    }

    public static MobileElement YesButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Yes\");"));
        return mobileElement;
    }

    public static MobileElement cancelButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Cancel\");"));
        return mobileElement;
    }

    public static WebElement allowAccessButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"OK\");"));
        return mobileElement;
    }

    public static WebElement doNotDisturbButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"OK\");"));
        return mobileElement;
    }

    public static MobileElement zoiperBetaDoNotDisturb(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"ZoiPer Beta\"));"));
        return mobileElement;
    }

    public static MobileElement zoiperFreeDoNotDisturb(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"ZoiPer\"));"));
        return mobileElement;
    }

    public static WebElement expireOkButton(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.zoiperbeta.app:id/zoiper_expire_dilaog_button"));
        return element;
    }

    public static WebElement expireGetStableVersionButton(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.zoiperbeta.app:id/zoiper_expire_get_stable_version"));
        return element;
    }

    public static MobileElement messagesMenuButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Messages button\");"));
        return mobileElement;
    }

    public static MobileElement startMessageButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"New message\");"));
        return mobileElement;
    }

    public static MobileElement messageRecipientField(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"To\");"));
        return mobileElement;
    }

    public static MobileElement typeMessageField(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Type message\");"));
        return mobileElement;
    }

    public static MobileElement sendArrowButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Send\");"));
        return mobileElement;
    }

    public static MobileElement backZoiperButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Navigate up\");"));
        return mobileElement;
    }

    public static MobileElement navigationDrawer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Open navigation drawer\");"));
        return mobileElement;
    }

    //    public static MobileElement accountArrowNavigationDrawer(AndroidDriver<AndroidElement> driver) {
//
//        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
//                ("new UiSelector().description(\"Show all accounts\");"));
//        return mobileElement;
//    }
    public static WebElement accountArrowNavigationDrawer(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.app:id/nav_drawer_accounts_menu"));
        return element;
    }

    public static MobileElement settingsNavigationDrawer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Settings\");"));
        return mobileElement;
    }

    public static MobileElement callRecordingNavigationDrawer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Call recording\");"));
        return mobileElement;
    }

    public static MobileElement warningsNavigationDrawer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Warnings\");"));
        return mobileElement;
    }

    public static MobileElement premiumFeaturesNavigationDrawer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Premium features\");"));
        return mobileElement;
    }

    public static MobileElement followUsNavigationDrawer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Follow us\");"));
        return mobileElement;
    }

    public static MobileElement TranslateNavigationDrawer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().description(\"Translate\"));"));
        return mobileElement;
    }

    public static MobileElement aboutNavigationDrawer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().description(\"About\"));"));
        return mobileElement;
    }

    public static MobileElement exitButtonNavigationDrawer(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().description(\"Exit\"));"));
        return mobileElement;
    }

    public static MobileElement dialPadButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Open dialpad\");"));
        return mobileElement;
    }

    public static MobileElement numberField(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Number\");"));
        return mobileElement;
    }

    public static MobileElement dialButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Dial\");"));
        return mobileElement;
    }

    public static MobileElement endCallButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"End Call\");"));
        return mobileElement;
    }

    public static MobileElement favouritesButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Favourite contacts button\");"));
        return mobileElement;
    }

    public static MobileElement contactsButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"All contacts button\");"));
        return mobileElement;
    }

    public static MobileElement turnOnButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Turn on\");"));
        return mobileElement;
    }

    public static MobileElement addContactsButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Add contact\");"));
        return mobileElement;
    }

    public static MobileElement historyButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Call log button\");"));
        return mobileElement;
    }

    public static MobileElement fullHistoryButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"View full call history\"));"));
        return mobileElement;
    }

    public static MobileElement lastMadeCall(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\""+dialedAndroidNumber+"\");"));
        return mobileElement;
    }

    public static WebElement freeTrial(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app:id/combo_free_trial_button"));

        return element;
    }

    public static WebElement subYearly(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app:id/combo_subs_yearly_button"));

        return element;
    }

    public static WebElement subMonthly(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app:id/combo_subs_monthly_button"));

        return element;
    }

    public static WebElement subscribeButton(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.zoiper.android.app:id/combo_subs_trial_button"));

        return element;
    }

    public static WebElement confirmSubscription(AndroidDriver<AndroidElement> driver) {
//
//        element = driver.findElement(By.id("com.android.vending:id/0_resource_name_obfuscated"));
//
//        return element;
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Subscribe\");"));
        return mobileElement;
    }

    public static WebElement verifySubscription(AndroidDriver<AndroidElement> driver) {
//
//        element = driver.findElement(By.id("com.android.vending:id/0_resource_name_obfuscated"));
//
//        return element;
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Verify\");"));
        return mobileElement;
    }
    public static WebElement passSubscription(AndroidDriver<AndroidElement> driver) {
//        element = driver.findElement(By.id("com.android.vending:id/0_resource_name_obfuscated"));
//
//        return element;
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\""+googlePlayAcc+"\");"));
        return mobileElement;
    }

    public static WebElement yesAlwaysSubscriptionButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Yes, always\");"));
        return mobileElement;
    }

    public static WebElement OKButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"OK\");"));
        return mobileElement;
    }

    public static WebElement linearCallRecordings(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Find how to access your Call Recording files\");"));
        return mobileElement;
    }

    public static WebElement selectAllButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Select all\");"));
        return mobileElement;
    }

    public static WebElement editContactName(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Name\");"));
        return mobileElement;
    }

    public static WebElement editContactNumber(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Phone number\");"));
        return mobileElement;
    }

    public static WebElement doneEditingContactNumber(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Done\");"));
        return mobileElement;
    }

    public static WebElement addedContactNumber(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\""+dialedAndroidNumber+"\");"));
        return mobileElement;
    }

    public static WebElement mergedAndroidNumber(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\""+dialedAndroidNumber+" ("+dialedAndroidNumber+")\");"));
        return mobileElement;
    }

    public static WebElement mergedDesktopNumber(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\""+dialedDesktopNumber+" ("+dialedDesktopNumber+")\");"));
        return mobileElement;
    }

    public static WebElement moreOptionsButton(AndroidDriver<AndroidElement> driver) {
        element = driver.findElement(By.id("com.android.contacts:id/contact_menuitem_menu"));

        return element;
    }

    public static WebElement deleteContact(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Delete contact\");"));
        return mobileElement;
    }

    public static WebElement DELETEButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"DELETE\");"));
        return mobileElement;
    }

    public static WebElement copyNumberButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Copy number\");"));
        return mobileElement;
    }

    public static WebElement editNumberBeforeCallButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Edit number before call\");"));
        return mobileElement;
    }

    public static WebElement deleteButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Delete\");"));
        return mobileElement;
    }

    public static WebElement activatePush(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Enable PUSH proxy\");"));
        return mobileElement;
    }

    public static WebElement addAccountNavDrawerButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Add account\");"));
        return mobileElement;
    }

    public static WebElement secondAcc(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"" + zoiperElements.secondAccNumber + "@" + zoiperElements.hostAddress + "\");"));
        return mobileElement;
    }

    public static WebElement thirdAcc(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"" + zoiperElements.thirdAccNumber + "@" + zoiperElements.hostAddress + "\");"));
        return mobileElement;
    }

    public static WebElement recordingsCheckBox(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.app:id/recordingsListItemCheckBox"));
        return element;
    }

    public static WebElement shareButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Share\");"));
        return mobileElement;
    }

    public static WebElement favouriteContact(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.app:id/contact_tile_id"));
        return element;
    }

    public static WebElement createAccButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Create account\");"));
        return mobileElement;
    }

    public static WebElement favouriteStarButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Favorite\");"));
        return mobileElement;
    }

    public static WebElement unfavouriteButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Unfavorite\");"));
        return mobileElement;
    }

    public static WebElement addAFavouriteButton(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Add a favorite\");"));
        return mobileElement;
    }

    public static WebElement diagnosticNavDrawer(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Diagnostic\");"));
        return mobileElement;
    }

    public static MobileElement simulateCrash(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Simulate crash\"));"));
        return mobileElement;
    }

    public static WebElement javaCrash(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Java crash\");"));
        return mobileElement;
    }

    public static WebElement nativeCrash(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Native crash\");"));
        return mobileElement;
    }

    public static WebElement simulateANR(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Simulate ANR\");"));
        return mobileElement;
    }

    public static WebElement restartingZoiperMessage(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.app:id/screen_wait_text"));
        return element;
    }

    public static WebElement messageThread(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\""+dialedAndroidNumber+"\");"));
        return mobileElement;
    }


    public static WebElement presenceIcon(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.app:id/presence_icon_id"));
        return element;
    }

    public static MobileElement sendEmailButton(AndroidDriver<AndroidElement> driver) {

        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"SEND EMAIL\"));"));
        return mobileElement;
    }

    public static WebElement deleteThread(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Delete thread\");"));
        return mobileElement;
    }

    public static WebElement noConversations(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"No conversations.\");"));
        return mobileElement;
    }

    public static WebElement noCallRecords(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"No call recordings found.\");"));
        return mobileElement;
    }

    public static WebElement facebookFollowUs(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Facebook\");"));
        return mobileElement;
    }

    public static WebElement twitterFollowUs(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Twitter\");"));
        return mobileElement;
    }

    public static WebElement translateNavDrawer(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Translate\");"));
        return mobileElement;
    }

    public static WebElement translateWeb(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"translate.zoiper.com\");"));
        return mobileElement;
    }

    public static WebElement searchFieldClick(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Search ...\");"));
        return mobileElement;
    }

    public static WebElement searchFieldInsert(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.app:id/search_view_id"));
        return element;
    }

    public static WebElement backFromSearch(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.app:id/search_back_button"));
        return element;
    }

    public static WebElement zoiperWebsite(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.app:id/about_site"));
        return element;
    }

    public static WebElement flipper(AndroidDriver<AndroidElement> driver) {

        element = driver.findElement(By.id("com.zoiper.android.app:id/viewFlipper"));
        return element;
    }

    public static WebElement premiumFeaturesMenu(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().text(\"Premium features\");"));
        return mobileElement;
    }

    public static WebElement navigateBack(AndroidDriver<AndroidElement> driver) {
        mobileElement = driver.findElement(MobileBy.AndroidUIAutomator
                ("new UiSelector().description(\"Navigate up\");"));
        return mobileElement;
    }

}
