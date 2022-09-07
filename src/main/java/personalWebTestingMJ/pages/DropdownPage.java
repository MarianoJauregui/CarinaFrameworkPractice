package com.qaprosoft.carina.demo.gui.personalWebTesting.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends AbstractPage {
    @FindBy(id = "dropdown")
    private ExtendedWebElement dropdown;
    @FindBy(xpath = "//option[@value='1']")
    private ExtendedWebElement option1;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }


    public void findDropdownElement(){
        dropdown.click();
        option1.click();
        option1.getText();
    }


}
