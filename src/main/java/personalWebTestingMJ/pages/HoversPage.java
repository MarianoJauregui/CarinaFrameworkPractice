package com.qaprosoft.carina.demo.gui.personalWebTesting.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HoversPage extends AbstractPage {

    public HoversPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "(//img[@alt=\"User Avatar\"])[1]")
    private ExtendedWebElement figureOne;

    public void hoverOverSomething(){
        figureOne.hover();
    }

}
