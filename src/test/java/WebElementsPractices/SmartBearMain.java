package WebElementsPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearMain {
    public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        //driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
        //driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();

        LoginToSmartBear(driver);
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        System.out.println("Number of all links on the page: " + links.size());

        System.out.println("LINKS ORDER:");
        for (WebElement link : links) {
            System.out.println(link.getText());
        }
    }
    public static void LoginToSmartBear (WebDriver driver){

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
    }

    public static void verifyOrder (WebDriver driver, String givenName){
        List<WebElement> allName = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        for (WebElement name:allName){
            if (name.getText().equals(givenName)){
                System.out.println(givenName + " exists in the list. verification PASSED!");
                return;

            }
        }

        System.out.println(givenName + " Doesn't exists in the list. verification FAILED!");


    }

    public static void printNamesAndCities (WebDriver driver){

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        List<WebElement> allCities = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[7]"));

        for (int i =0; i<allCities.size(); i++ ){
            System.out.println(allNames.get(i).getText()+" <---name , city ---> "+ allCities.get(i).getText());
        }


    }

}
