package myOwnWebTesting;

import com.qaprosoft.carina.core.foundation.IAbstractTest;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import personalWebTestingMJ.pages.HerokuAppHomePage;

public class HerokuAppBaseTests implements IAbstractTest {

    protected HerokuAppHomePage homePage = new HerokuAppHomePage(getDriver());

    @BeforeMethod
    public void setUp() {
        //open The Internet - Heroku App
        homePage.open();
        //Check if the page was opened
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");

    }

    @AfterSuite
    public void tearDown(){
        homePage.quitDriver();
    }



}