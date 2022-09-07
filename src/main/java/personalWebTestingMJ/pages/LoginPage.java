package personalWebTestingMJ.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    private ExtendedWebElement usernameField;
    @FindBy(id = "password")
    private ExtendedWebElement passwordField;
    @FindBy(css = "#login button")
    private ExtendedWebElement loginButton;

    public void setUserAndPassword(String username, String password){
        usernameField.type(username);
        passwordField.type(password);
    }

    public SecureAreaPage clickLoginButton(){
        loginButton.click();
        return new SecureAreaPage(driver);
    }
}
