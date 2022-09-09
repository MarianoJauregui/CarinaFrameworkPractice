package myOwnWebTesting.instagramTesting;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import personalWebTestingMJ.pages.instagram.InstagramFeedPage;
import personalWebTestingMJ.pages.instagram.InstagramLoginPage;
import personalWebTestingMJ.pages.instagram.InstagramProfilePage;
import personalWebTestingMJ.pages.instagram.PrivateMessagePage;

public class InstagramTests implements IAbstractTest {

    private final InstagramLoginPage instagramHomePage = new InstagramLoginPage(getDriver());

    @BeforeClass
    public void setUp(){
        instagramHomePage.openURL("https://www.instagram.com/");
        Assert.assertTrue(instagramHomePage.isPageOpened(),
                "Instagram home page is not opened.");
        InstagramFeedPage feedPage = instagramHomePage.loginOnInstagram("?", "?");
    }

    //@AfterClass
    public void tearDown(){
        instagramHomePage.quitDriver();
    }

    @Test
    public void testLogin() throws InterruptedException {
        InstagramFeedPage feedPage = new InstagramFeedPage(getDriver());
        InstagramProfilePage profilePage = feedPage.searchForSomeone();
        PrivateMessagePage privateMessagePage = profilePage.sendPrivateMessage();
        privateMessagePage.typeMessage();
    }

}
