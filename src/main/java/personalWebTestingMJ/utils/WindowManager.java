package personalWebTestingMJ.utils;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class WindowManager extends AbstractPage {

    private WebDriver.Navigation navigate;


    public WindowManager(WebDriver driver) {
        super(driver);
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url) {
        navigate.to(url);
    }

}
