package com.qaprosoft.carina.demo.gui.personalWebTesting.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class KeyPressPage extends AbstractPage {



    @FindBy(id = "target")
    private ExtendedWebElement inputField;
    @FindBy(id = "result")
    private ExtendedWebElement resultText;

    public KeyPressPage(WebDriver driver) {
        super(driver);
    }

    public void enterText(String text){
        inputField.type(text);
    }

    public String getResult(){
        return resultText.getText();
    }


}
