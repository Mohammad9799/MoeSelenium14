package WebElementsPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartbearSoftwareLineVerification {

    public static void loginToSmartBear(WebElement driver){

        WebElement usernameLogin = driver.findElement(By.id("ctl00_MainContent_username"));

        WebElement passwordLogin = driver.findElement(By.id("ctl00_MainContent_password"));


        WebElement LoginButton = driver.findElement(By.name("ctl00$MainContent$login_button"));

        usernameLogin.sendKeys("Tester");
        passwordLogin.sendKeys("test");
        LoginButton.click();

    }

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");



        List<WebElement> links = driver.findElements(By.xpath("//body//a"));

        System.out.println("Count of all the links in page: " + links.size());



        for (WebElement link : links){
            System.out.println("refernce of the object: " +link);
            System.out.println("text of the object: "+link.getText());
        }


    }
}
