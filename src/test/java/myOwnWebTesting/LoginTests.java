package myOwnWebTesting;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import personalWebTestingMJ.pages.HerokuAppHomePage;
import personalWebTestingMJ.pages.LoginPage;
import personalWebTestingMJ.pages.SecureAreaPage;

public class LoginTests implements IAbstractTest {

    protected HerokuAppHomePage homePage = new HerokuAppHomePage(getDriver());

    @BeforeClass
    public void setUp(){
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    }

    @AfterClass
    public void tearDown(){
        homePage.quitDriver();
    }

    @Test
    public void testSuccessLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserAndPassword("tomsmith", "SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!")
                , "Alert text is incorrect.");
    }
}
