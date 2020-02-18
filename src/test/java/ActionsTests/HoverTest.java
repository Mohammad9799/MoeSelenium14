package ActionsTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomeWorks.TheBall;
import utillites.Driver;

public class HoverTest {

    @BeforeClass
    public void setup(){
    Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
             }


             @Test
            public void DragTheBall(){
                 TheBall theBall = new TheBall();

                 Actions actions = new Actions(Driver.getDriver());

               



                 String expectedText = "You did great!";
                 String actualText = theBall.theTarget.getText();


                 Assert.assertEquals(actualText,expectedText,"Wrong text");

             }




}
