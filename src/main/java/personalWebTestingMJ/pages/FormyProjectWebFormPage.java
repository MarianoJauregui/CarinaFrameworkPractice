package personalWebTestingMJ.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FormyProjectWebFormPage extends AbstractPage {
    /*
    This an exercise of the TAU course.
     */
    public FormyProjectWebFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    private ExtendedWebElement firstNameField;
    @FindBy(id = "last-name")
    private ExtendedWebElement lastNameField;
    @FindBy(id = "job-title")
    private ExtendedWebElement jobTitleField;
    @FindBy(id = "radio-button-2")
    private ExtendedWebElement levelOfEducation;
    @FindBy(xpath = "//input[@value='checkbox-1']")
    private ExtendedWebElement sexCheck;
    @FindBy(xpath = "//option[@value=2]")
    private ExtendedWebElement yearsOfExperience;
    @FindBy(xpath = "//a[@role='button']")
    private ExtendedWebElement submitButton;

    public void submitAllInfo(String username, String lastName, String jobTitle){
        firstNameField.type(username);
        lastNameField.type(lastName);
        jobTitleField.type(jobTitle);
        levelOfEducation.click();
        sexCheck.check();
        yearsOfExperience.click();
        submitButton.click();
    }

}
