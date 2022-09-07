package personalWebTestingMJ.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HerokuAppHomePage extends AbstractPage {
    //private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public HerokuAppHomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(linkText = "Form Authentication")
    private ExtendedWebElement formAuthenticationLink;



    public LoginPage clickFormAuthentication(){
        formAuthenticationLink.click();
        return new LoginPage(driver);
    }

}
