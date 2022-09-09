package personalWebTestingMJ.pages.instagram;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PrivateMessagePage extends AbstractPage {
    public PrivateMessagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div/textarea")
    private ExtendedWebElement textArea;

    public void typeMessage(){
        textArea.type("1 2 3 probando hola hola si si si");
        textArea.sendKeys(Keys.ENTER);
    }
}
