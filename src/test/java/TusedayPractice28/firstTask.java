package TusedayPractice28;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class firstTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

         //  1. Open	browser

        //  2. Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //  3. Enter username: “Tester”
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //  4. Enter password: “test”
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //  5. Click to Login button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        //  6. Print out count of all the links on landing page
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        System.out.println("Count of all the links in page: " + links.size());

        //  7. Print out each link text on this page
        for (WebElement link:links){
            System.out.println("text of the object: "+ link.getText());
        }

        driver.close();


    }
}
