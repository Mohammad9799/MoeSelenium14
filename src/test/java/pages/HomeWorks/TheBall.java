package pages.HomeWorks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utillites.Driver;

import java.nio.file.Watchable;

public class TheBall {

    public TheBall(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@id='draggable']")
    public WebElement theBall;


    @FindBy(xpath = "//div[@id='droptarget']")
    public WebElement theTarget;


    // You did great!


}
