package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utillites.Driver;
import utillites.SeleniumUtils;

import java.util.concurrent.TimeUnit;

public class WindowHandlePractice {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void practice(){
       String mainWindow = Driver.getDriver().getWindowHandle();

    }



    @Test
    public void newWindowTest(){

        String mainHandle = driver.getWindowHandle();
        System.out.println(mainHandle);


        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle,"Titles are not matching!!!!");
        //-------------------------------------------------------------------------------------\\

        WebElement newWindowBtn = driver.findElement(By.linkText("Click Here"));
        newWindowBtn.click();

        for(String handle:driver.getWindowHandles()){

            if (!handle.equals(mainHandle)){
                driver.switchTo().window(handle);
            }
        }

        System.out.println(driver.getTitle());



    }










}
//    WebElement newWindowBtn = driver.findElement(By.linkText("Click Here"));
//        newWindowBtn.click();