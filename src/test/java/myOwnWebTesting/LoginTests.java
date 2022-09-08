package myOwnWebTesting;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import personalWebTestingMJ.pages.LoginPage;
import personalWebTestingMJ.pages.SecureAreaPage;

public class LoginTests extends HerokuAppBaseTests implements IAbstractTest {


    @Test
    public void testSuccessLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserAndPassword("tomsmith", "SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        Assert.assertTrue(secureAreaPage.getStatusAlertText().contains("You logged into a secure area!"),
                "Text is not correct.");


    }
}
