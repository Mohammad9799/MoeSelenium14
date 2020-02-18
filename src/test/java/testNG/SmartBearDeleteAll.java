package testNG;

import WebElementsPractices.SmartBearMain;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearDeleteAll {

    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void deleteAllTest(){

        SmartBearMain.LoginToSmartBear(driver);

        WebElement checkAll = driver.findElement(By.id("ctl00_MainContent_btnCheckAll"));
        checkAll.click();

        List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));

        for (WebElement checkbox:checkboxes){
            Assert.assertTrue(checkbox.isSelected());
        }

        WebElement deleteSelectBtn = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteSelectBtn.click();


WebElement emptyOrderListMessage = driver.findElement(By.id("ctl00_MainContent_orderMessage"));

Assert.assertTrue(emptyOrderListMessage.isDisplayed(),"Empty order list message is not displayed");
    }






}
