package com.qaprosoft.carina.demo.gui.personalWebTesting.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    //private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "a[href='/inputs']")
    private ExtendedWebElement inputLink;
    @FindBy(linkText = "Form Authentication")
    private ExtendedWebElement formAuthenticationLink;
    @FindBy(css = "a[href='/dropdown']")
    private ExtendedWebElement dropdownLink;
    @FindBy(linkText = "Hovers")
    private ExtendedWebElement hover;
    @FindBy(css = "a[href='/key_presses']")
    private ExtendedWebElement keyPress;
    @FindBy(linkText = "JavaScript Alerts")
    private ExtendedWebElement javaScriptAlert;

    public LoginPageForm clickFormAuthentication(){
        formAuthenticationLink.click();
        return new LoginPageForm(driver);
    }

    public DropdownPage clickDropdown(){
        dropdownLink.click();
        return new DropdownPage(driver);
    }

    public HoversPage clickHover(){
        hover.click();
        return new HoversPage(driver);
    }

    public KeyPressPage clickKeyPress(){
        keyPress.click();
        return new KeyPressPage(driver);
    }

    public AlertsPage clickAlertsPage(){
        javaScriptAlert.click();
        return new AlertsPage(driver);
    }


}
