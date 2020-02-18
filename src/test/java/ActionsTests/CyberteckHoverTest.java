package ActionsTests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.praticeCybertekPages.HoverPage;
import utillites.Driver;

public class CyberteckHoverTest {


    @Test
    public void checkTheText(){

        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        HoverPage hover = new HoverPage();

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(hover.firstPicture).perform();

        Assert.assertTrue(hover.firstText.isDisplayed(),"first text not displayed");


    }


    @Test
    public void checkThe2Text(){

        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        HoverPage hover = new HoverPage();

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(hover.secondPicture).perform();

        Assert.assertTrue(hover.secondText.isDisplayed(),"second text not displayed");


    }

    @Test
    public void checkThe3Text(){

        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        HoverPage hover = new HoverPage();

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(hover.thirdPicture).perform();

        Assert.assertTrue(hover.thirdText.isDisplayed(),"third text not displayed");


    }


}
