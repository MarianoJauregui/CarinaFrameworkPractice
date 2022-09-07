package myOwnWebTesting;

import com.qaprosoft.carina.core.foundation.IAbstractTest;


import org.testng.Assert;
import org.testng.annotations.Test;
import personalWebTestingMJ.pages.HerokuAppHomePage;

public class HerokuAppTests implements IAbstractTest {

    @Test
    public void search() {
        //open The Internet - Heroku App
        HerokuAppHomePage homePage = new HerokuAppHomePage(getDriver());
        homePage.open();
        //Check if the page was opened
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");


    }


}