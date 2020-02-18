package testNG.MoeTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframeTests {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/iframe");
    }

    @Test
    public void iframeTask(){
        driver.switchTo().frame("mce_0_ifr");

        WebElement theTextDisplayed = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(theTextDisplayed.isDisplayed(),"The text is not displayed!!");

        driver.switchTo().parentFrame();

        WebElement theHeaderText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(theHeaderText.isDisplayed(),"The Header text not displayed!!");


    }

//    @AfterClass
//    public void CloseTheWebDriver(){
//        driver.close();
//    }




}
