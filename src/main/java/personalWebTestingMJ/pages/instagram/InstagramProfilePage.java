package personalWebTestingMJ.pages.instagram;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class InstagramProfilePage extends AbstractPage {
    public InstagramProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button/div[contains(text(), 'Enviar mensaje')]")
    private ExtendedWebElement sendMessageButton;

    public PrivateMessagePage sendPrivateMessage(){
        sendMessageButton.click();
        return new PrivateMessagePage(getDriver());
    }
}
