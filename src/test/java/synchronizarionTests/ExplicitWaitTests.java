package synchronizarionTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.praticeCybertekPages.DynamicLoading1Page;
import utillites.Driver;

import javax.swing.*;
import java.awt.*;

public class ExplicitWaitTests {


    @Test
    public void waitForInputBoxInput(){

        //1- get the page
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");

        //2- create object to use webElements

        DynamicLoading1Page dynamicLoading1Page = new DynamicLoading1Page();


        //3- click to start button
        dynamicLoading1Page.startButton.click();
        //4- we create the webDriverWait class object and pass driver and seconds
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        wait.until(ExpectedConditions.visibilityOf(dynamicLoading1Page.usernameInput));



        dynamicLoading1Page.usernameInput.sendKeys("tomsmith");


        Actions actions = new Actions(Driver.getDriver());



    }
}
