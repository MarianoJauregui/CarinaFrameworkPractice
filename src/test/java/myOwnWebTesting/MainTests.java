package myOwnWebTesting;

import com.qaprosoft.carina.core.foundation.IAbstractTest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.personalWebTesting.pages.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class MainTests implements IAbstractTest {

    protected HomePage homePage = new HomePage(getDriver());

    @BeforeClass
    public void setUpTest() {
        //open TheInternetHeroku App
        homePage.open();
        //Check if the page was opened
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
    }

    //Login tests
    @Test
    public void testSuccessLogin() {
        LoginPageForm loginPageForm = homePage.clickFormAuthentication();
        loginPageForm.setUserInput("tomsmith");
        loginPageForm.setPasswordInput("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPageForm.clickLoginButton();
        Assert.assertEquals(secureAreaPage.getStatusAlertText(),
                    "You logged into a secure area!\n" +
                            "×",
                    "Alert text is incorrect");
    }

    //Dropdown test
    @Test
    public void testSelectOption(){
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.findDropdownElement();
    }

    //Hover test
    @Test
    public void testHover(){
        HoversPage hoversPage = homePage.clickHover();
        hoversPage.hoverOverSomething();
    }

    //Send key test
    @Test
    public void testKeys(){
        KeyPressPage keyPressPage = homePage.clickKeyPress();
        keyPressPage.enterText("I am writing something " + Keys.BACK_SPACE);
        keyPressPage.getResult();
    }

    //Alerts test
    @Test
    public void testAlertJs(){
        AlertsPage alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        Assert.assertEquals(alertsPage.getResults(), "You successfully clicked an alert", "Results don't match");
    }


}