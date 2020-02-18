package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utillites.Driver;

import java.util.WeakHashMap;

public class LoginPage {

    // When we are creating POM page
    // 1- Create the constructor and call pageFactory method

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // 2-@ FindBy annotation to locate WebElements

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameInput;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordInput;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errorMessage;

}
