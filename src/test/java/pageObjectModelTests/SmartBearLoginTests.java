package pageObjectModelTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utillites.Config;
import utillites.Driver;

public class SmartBearLoginTests {

    LoginPage loginPage = new LoginPage();

    @Test
    public void wrongUsernameTest(){

//        1- we get the page
        Driver.getDriver().get(Config.getProperty("smartbaerUrl"));
//           2- we enter wrong username

        String wrongUsername = Config.getProperty("wrongUsername");
        loginPage.usernameInput.sendKeys(wrongUsername);

//           3- we enter correct password

        String correctPassword = Config.getProperty("correctPassword");
        loginPage.passwordInput.sendKeys(correctPassword);



//           4- click login button
        loginPage.loginButton.click();
//           5- verify error message
       Assert.assertTrue(loginPage.errorMessage.isDisplayed(),"Error Message is NOT displayed!!");
//

    }

    @Test
    public void wrongPassword(){


        LoginPage loginPage = new LoginPage();

        Driver.getDriver().get(Config.getProperty("smartbaerUrl"));



        String correctUsername = Config.getProperty("correctUsername");
        loginPage.usernameInput.sendKeys(correctUsername);


        String wrongPassword = Config.getProperty("wrongPassword");
        loginPage.passwordInput.sendKeys(wrongPassword);

        loginPage.loginButton.click();

        Assert.assertTrue(loginPage.errorMessage.isDisplayed(),"Error Message is NOT displayed!!");


    }
    @Test
    public void noUsername(){

        Driver.getDriver().get(Config.getProperty("smartbaerUrl"));


        loginPage.passwordInput.sendKeys(Config.getProperty("correctPassword"));

        Assert.assertTrue(loginPage.errorMessage.isDisplayed(),"is not displayed");

    }



    @Test
    public void noPassword(){

        Driver.getDriver().get(Config.getProperty("smartbaerUrl"));

        loginPage.usernameInput.sendKeys("correctUsername");

        Assert.assertTrue(loginPage.errorMessage.isDisplayed(),"Error Message is not displayed");


    }





}
