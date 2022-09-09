package personalWebTestingMJ.pages.instagram;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class InstagramLoginPage extends AbstractPage {
    private final static Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public InstagramLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='username']")
    private ExtendedWebElement usernameField;
    @FindBy(xpath = "//input[@name='password']")
    private ExtendedWebElement passwordField;
    @FindBy(xpath = "//div/button/div")
    private ExtendedWebElement loginButton;

    public InstagramFeedPage loginOnInstagram(String username, String password){
        usernameField.type(username);
        passwordField.type(password);
        loginButton.click();
        return new InstagramFeedPage(getDriver());
    }

}
