package personalWebTestingMJ.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPageForm extends AbstractPage {

    public LoginPageForm(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "username")
    private ExtendedWebElement userInput;
    @FindBy(id = "password")
    private ExtendedWebElement passwordInput;
    @FindBy(css = "#login button")
    private ExtendedWebElement loginButton;

    public void setUserInput(String username){
        userInput.type(username);
    }
    public void setPasswordInput(String password){
        passwordInput.type(password);
    }
    public SecureAreaPage clickLoginButton(){
        loginButton.click();
        return new SecureAreaPage(driver);
    }



}
