package com.qaprosoft.carina.demo.gui.personalWebTesting.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends AbstractPage {

    @FindBy(xpath = ".//button[text()='Click for JS Alert']")
    private ExtendedWebElement triggerJsAlert;
    @FindBy(id = "result")
    private ExtendedWebElement results;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void triggerAlert(){
        triggerJsAlert.click();
    }

    public String getResults(){
        System.out.println("THIS IS THE RESULT I AM GETTING IN THIS METHOD " + results.getText());
        return results.getText();
    }

}
