package synchronizarionTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.praticeCybertekPages.DynamicLoading2Page;
import utillites.Driver;

public class ImplicitWaitTests {


    @Test
    public void threadSleepTest() throws InterruptedException{
        //1- getting the page
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/2");

        //2- Creating object to be able to reach Page class' webElements
        DynamicLoading2Page dynamicLoading2Page = new DynamicLoading2Page();

        //3- Clicking to the Start button using the object we created
        dynamicLoading2Page.startButton.click();

        //4- Assert the webElement is displayed on the page
        Assert.assertTrue(dynamicLoading2Page.helloWordText.isDisplayed(),
                "Text is NOT displayed on the page!");



    }
}
