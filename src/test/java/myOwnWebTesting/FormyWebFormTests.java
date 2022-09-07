package myOwnWebTesting;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import personalWebTestingMJ.pages.FormyProjectWebFormPage;

public class FormyWebFormTests implements IAbstractTest {
    protected FormyProjectWebFormPage exercisePage = new FormyProjectWebFormPage(getDriver());

    @BeforeClass
    public void setUp(){
        exercisePage.openURL("https://formy-project.herokuapp.com/form");
        Assert.assertTrue(exercisePage.isPageOpened(),
                "Page is not opened, please try again.");
    }

    @AfterClass
    public void tearDown(){
        exercisePage.quitDriver();
    }

    @Test
    public void testCorrectForm(){
        exercisePage.submitAllInfo("Martin","Martinez","QA Engineer");
    }
}
