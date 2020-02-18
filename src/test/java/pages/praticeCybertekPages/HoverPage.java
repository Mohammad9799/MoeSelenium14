package pages.praticeCybertekPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utillites.Driver;

public class HoverPage {

    public HoverPage (){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//img[@alt='User Avatar'])[1]")
    public WebElement firstPicture;

    @FindBy(xpath = "(//img[@alt='User Avatar'])[2]")
    public WebElement secondPicture;

    @FindBy(xpath = "(//img[@alt='User Avatar'])[3]")
    public WebElement thirdPicture;




    @FindBy(xpath = "(//div[@class='figcaption']/h5)[1]")
    public WebElement firstText;


    @FindBy(xpath = "(//div[@class='figcaption']/h5)[2]")
    public WebElement secondText;


    @FindBy(xpath = "(//div[@class='figcaption']/h5)[3]")
    public WebElement thirdText;



}
