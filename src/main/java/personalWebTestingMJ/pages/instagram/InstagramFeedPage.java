package personalWebTestingMJ.pages.instagram;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class InstagramFeedPage extends AbstractPage {
    public InstagramFeedPage(WebDriver driver) {
        super(driver);
    }
    //This is the page that we get when we log in on Instagram

    // The idea of this page and its tests is to automate sending messages and liking pictures on Instagram
    @FindBy(xpath = "//div/button[contains(text(), 'Ahora no')]")
    private ExtendedWebElement closeFrame;
    @FindBy(xpath = "//input/parent::*") // ""
    private ExtendedWebElement searchButton;
    @FindBy(xpath = "//div/a[@href='/?nameHere?/?hl=es']") // //div/a[@href='/nameHere/']
    private ExtendedWebElement sophieSearch;


    public InstagramProfilePage searchForSomeone() {
        //closeFrame.click();

        searchButton.click();
        searchButton.type("?");
        sophieSearch.click();
        return new InstagramProfilePage(getDriver());
    }

}
