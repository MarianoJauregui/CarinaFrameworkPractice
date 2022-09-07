package com.qaprosoft.carina.demo.gui.personalWebTesting.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage extends AbstractPage {
    public SecureAreaPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@id='flash']")
    private ExtendedWebElement statusAlert;

    public String getStatusAlertText(){
        return statusAlert.getText();
    }
}
